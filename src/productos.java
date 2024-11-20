import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class productos {
    int bebida1Y = 34, incremento =2;
    Fondo f;

    public productos(Fondo f) {
        this.f = f;
    }

    public void paint(Graphics g) {
        Imagenes imagen = new Imagenes();
        imagen.paint(g, "/Imagenes/bebida1.png", 130, bebida1Y, 30, 70);
    }

    public void movimiento(){
        if (bebida1Y >= 34&& bebida1Y<=300) {
            bebida1Y+=incremento;
            System.out.println("movimiento");
        }

    }

}
