import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class productos {
    int y = 34, incremento =2;
    Fondo f;
    Timer t;


    public productos(Fondo f) {
        this.f = f;
        t = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y >= 34 && y <= 500) {
                    y += incremento;
                    f.repaint();
                } else {
                    t.stop();
                }
            }
        });
    }

    public void paint(Graphics g) {
        Imagenes imagen = new Imagenes();
        Imagenes imagen2 = new Imagenes();

        imagen.paint(g, "/Imagenes/bebida1.png", 130, y, 30, 70);
        imagen2.paint(g, "/Imagenes/bebida2.png", 200, 34, 30, 70);
        imagen2.paint(g, "/Imagenes/bebida3.png", 270, 34, 30, 70);
        imagen2.paint(g, "/Imagenes/bebida4.png", 340, 34, 30, 70);
        imagen2.paint(g, "/Imagenes/bebida5.png", 410, 34, 30, 70);


    }

    public void movimiento(){
        if (!t.isRunning()) {
            t.start();
        }

    }

    }

