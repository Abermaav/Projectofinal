import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class productos {
    int bebida1Y = 34;

    public void paint(Graphics g){
        Imagenes imagen = new Imagenes();
        imagen.paint(g,"/Imagenes/bebida1.png", 130, bebida1Y, 30, 70);
    }

}
