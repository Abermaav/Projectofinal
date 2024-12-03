import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class productos {
    int y, x, ancho, alto, incremento = 2, xOriginal, yOriginal;
    Fondo f;
    Timer t;
    String imagenNombre;
    boolean resetFlag = false;

    public productos(Fondo f, String imagenNombre, int x, int y, int ancho, int alto) {
        this.f = f;
        this.imagenNombre = imagenNombre;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.xOriginal = x;
        this.yOriginal = y;
    }

    public void paint(Graphics g) {
        Imagenes imagen = new Imagenes();
        imagen.paint(g, imagenNombre, x, y, ancho, alto);
    }

    public void reset() {
        this.x = xOriginal;
        this.y = yOriginal;
        if (t != null && t.isRunning()) {
            t.stop();
        }
        t = null;
        resetFlag = true;
    }

    public void movimiento() {
        if (resetFlag) {
            return;
        }
        if (t == null || !t.isRunning()) {
            this.t = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (productos.this.y >= 34 && productos.this.y <= 640) {
                        productos.this.y += incremento;
                        f.repaint();
                    } else {
                        t.stop();
                    }
                }
            });
            t.start();
        }
    }
}
