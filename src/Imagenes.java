import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Imagenes{
        private URL imageIcon;
        private ImageIcon imagenFinal;

    public void paint(Graphics g,String imagen, int x, int y, int ancho, int alto) {
        imageIcon = getClass().getResource(imagen);
        if (imageIcon != null) {
            imagenFinal = new ImageIcon(imageIcon);
            g.drawImage(imagenFinal.getImage(),x , y,ancho,   alto,null);
        } else {
            System.err.println("Image not found: " + imagen);
        }
    }
}

