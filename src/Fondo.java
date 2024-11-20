import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Fondo extends JPanel {
productos producto = new productos();

    public Fondo() {
        JFrame ventana = new JFrame("Juego de la maquina");
        ventana.setSize(700, 730);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(this);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        URL imageUrl = getClass().getResource("/Imagenes/maquina.png");
        if (imageUrl != null) {
            ImageIcon tela = new ImageIcon(imageUrl);
            g.drawImage(tela.getImage(), 0, 0, 700, 700, null);
        } else {
            System.err.println("Image not found: /maquina.png");
        }
        producto.paint(g);

    }
}
