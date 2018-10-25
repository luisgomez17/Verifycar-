package Modelo;


import java.awt.Font;
import java.io.File;
import java.io.InputStream;

/*
 *
 * @author Raul
 */
public class Tipografia {
    
    private Font font = null;
    public String PTD = "Panettone_DEMO.otf";
    
    public Font fuente( String fontName, int estilo, float tamanio)
    {
         try {
             File f;
             f = new File("src//Modelo//Panettone_DEMO.otf");
             InputStream file = getClass().getResourceAsStream(fontName);
            //Se carga la fuente
            font = Font.createFont(Font.TRUETYPE_FONT, file);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 12);            
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
