package Reportes;

import Clases.Asiento;
import Clases.Pelicula;
import Clases.Sala;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ImprimirPDF {

    //Variables con setter y getters (cliente)
    private final Pelicula pelicula;
    private final Sala sala;

    //Variables sin setter y getters
    FileOutputStream archivo;
    File file;
    Document documento;
    Paragraph texto;
    Image image;
    Font fuenteTitulo;

    LocalDateTime ahora = LocalDateTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String fechaFormateada = ahora.format(formato);

    public ImprimirPDF(Pelicula pelicula, Sala sala) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.documento = new Document();
        this.fuenteTitulo = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLDITALIC, BaseColor.BLUE);

    }

    public void ImprimirBoleta() {
        try {
            this.archivo = new FileOutputStream("src/Tickets/boleta1.pdf");//"src/pdf/Orden"+getNumeroOrden+".pdf"
            /*Esto guarda el archivo en el directorio donde se ejecuta tu programa, con el nombre del director más la extensión .pdf.*/
            PdfWriter.getInstance(this.documento, this.archivo);
            /*
            this.documento es una instancia de la clase Document (es decir, representa el contenido del PDF).
            this.archivo es probablemente un FileOutputStream, que representa el archivo físico donde se guardará el PDF.
             */
            this.documento.open();
            /*
            0 → Element.ALIGN_LEFT (alineado a la izquierda)

            1 → Element.ALIGN_CENTER (centrado)

            2 → Element.ALIGN_RIGHT (alineado a la derecha)

            3 → Element.ALIGN_JUSTIFIED (justificado)

            4 → Element.ALIGN_JUSTIFIED_ALL (justificado completamente)
             */
            this.image = null;
            try {
                this.image = Image.getInstance("src/Img/logo_wsp.jpg");//carga imagen
                this.image.scaleAbsolute(150, 100);//cambia tamaño de la imagen
                this.image.setAlignment(2);//Alinea a la derecha
                /*
                Image.ALIGN_LEFT	0	Alineado a la izquierda
                Image.ALIGN_CENTER	1	Centrado
                Image.ALIGN_RIGHT	2	Alineado a la derecha
                Image.ALIGN_UNDEFINED	-1	Sin alineación definida
                Image.TEXTWRAP	4	Texto se ajusta alrededor de la imagen
                Image.UNDERLYING	8	Imagen debajo del texto
                Image.ALIGN_BASELINE	32	Alineado con la línea base
                */

            } catch (BadElementException | IOException e) {
                System.out.println("Error: " + e);
            }

            this.documento.add(this.image);//agrega la imagen al documento

            this.texto = new Paragraph("Dibujitos Premier", this.fuenteTitulo);
            this.texto.setAlignment(1);//centrar
            this.documento.add(this.texto);//Añadir el titulo

            /*Descripcion de la Pelicula*/
            Paragraph fecha = new Paragraph("Fecha: " + this.fechaFormateada);
            fecha.setAlignment(0);//derecha
            this.documento.add(fecha);//Añadir fecha

            Paragraph tituloPelicula = new Paragraph("Titulo: " + this.pelicula.getTitulo());
            tituloPelicula.setAlignment(0);//derecha
            this.documento.add(tituloPelicula);//Añadir fecha

            Paragraph duracionPelicula = new Paragraph("Duracion: " + this.pelicula.getDuracion()+" min");
            duracionPelicula.setAlignment(0);//derecha
            this.documento.add(duracionPelicula);//Añadir duracionPelicula

            Paragraph generoPelicula = new Paragraph("Genero: " + this.pelicula.getGenero());
            generoPelicula.setAlignment(0);//derecha
            this.documento.add(generoPelicula);//Añadir generoPelicula

            Paragraph cantidadEntradas = new Paragraph("N° Asientos: " + this.sala.getAsientoSeleccionados().length);
            cantidadEntradas.setAlignment(0);//derecha
            this.documento.add(cantidadEntradas);//Añadir generoPelicula
            
            Paragraph asientosReservados = new Paragraph("Asientos Reservados: ");
            asientosReservados.setAlignment(0);//derecha
            this.documento.add(asientosReservados);
            Asiento[] seleccionados = this.sala.getAsientoSeleccionados();//extraendo los asientos reservados

            for (Asiento asiento : seleccionados) {
                if (asiento != null) {
                    documento.add(new Paragraph(asiento.toString()));
                }
            }
            this.documento.add(Chunk.NEWLINE);
            /*-------------------------------------------------------------------------------------------------*/

            this.documento.close();
            JOptionPane.showMessageDialog(null, "Se ha impreso correctamente el ticket");
        } catch (FileNotFoundException | DocumentException e) {
            System.err.println(e.getMessage());
        }
    }

}
