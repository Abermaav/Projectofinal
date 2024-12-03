import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class productos {
    int y , x , ancho, alto, incremento =2;
    Fondo f;
    Timer t;
    String imagenNombre;

    public productos(Fondo f, String imagenNombre, int x, int y, int ancho, int alto) {
        this.f = f;
        this.imagenNombre = imagenNombre;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void paint(Graphics g) {
        Imagenes imagen = new Imagenes();
        imagen.paint(g, imagenNombre, x, y, ancho, alto);

    }

    public void movimiento() {
        t = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y >= 34 && y <= 640) {
                    y += incremento;
                    f.repaint();
                } else {
                    t.stop();
                }
            }
        });
        if (!t.isRunning()) {
            t.start();
        }}}

