import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Fondo extends JPanel implements ActionListener {
    productos producto, producto2, producto3, producto4, producto5, producto6, producto7, producto8, producto9, producto10, producto11, producto12;
    JButton musica, cocacola;
    JLayeredPane layeredPane;
    JLabel salida;
        boolean pipipi = true;
    public Fondo() {
        JFrame ventana = new JFrame("Juego de la maquina");
        ventana.setSize(750, 1010);

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1300, 1000);
        ventana.add(layeredPane);

        producto = new productos(this, "/Imagenes/bebida1.png", 100, 55, 45, 104);
        producto2 = new productos(this, "/Imagenes/bebida2.png", 250, 55, 75, 104);
        producto3 = new productos(this, "/Imagenes/bebida11.png", 400, 55, 75, 104);

        producto4 = new productos(this, "/Imagenes/comida3.png", 100, 200, 80, 110);
        producto5 = new productos(this, "/Imagenes/comida4.png", 250, 200, 80, 110);
        producto6 = new productos(this, "/Imagenes/comida7.png", 400, 200, 80, 110);

        producto7 = new productos(this, "/Imagenes/bebida3.png", 100, 350, 80, 110);
        producto8 = new productos(this, "/Imagenes/bebida9.png", 250, 340, 100, 130);
        producto9 = new productos(this, "/Imagenes/bebida7.png", 400, 345, 100, 130);

        producto10 = new productos(this, "/Imagenes/bebida8.png", 100, 490, 100, 130);
        producto11 = new productos(this, "/Imagenes/bebida5.png", 250, 500, 80, 110);
        producto12 = new productos(this, "/Imagenes/bebida6.png", 400, 498, 80, 110);





        musica = new JButton("Musika");
        musica.setBounds(500, 20, 80, 70);
        musica.addActionListener(this);
        layeredPane.add(musica, JLayeredPane.PALETTE_LAYER);

        cocacola = new JButton("coca cola");
        cocacola.setBounds(500, 100, 80, 70);
        cocacola.addActionListener(this);
        layeredPane.add(cocacola, JLayeredPane.PALETTE_LAYER);

        salida = new JLabel();
        salida.setBounds(450, 500, 80, 70);
        salida.setBackground(new Color(17, 39, 243));
        salida.setOpaque(true);
        add(salida);

        this.setBounds(0, 0, 1300, 1000);
        layeredPane.add(this, JLayeredPane.DEFAULT_LAYER);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == musica) {

            Musica.playWAV("src/sonidos/sonido.wav");

        }
        if (evento.getSource() == cocacola) {
            producto.movimiento();
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        URL imageUrl = getClass().getResource("/Imagenes/maquinaFondo.png");
        if (imageUrl != null) {
            ImageIcon fondo = new ImageIcon(imageUrl);
            g.drawImage(fondo.getImage(), 10, 10, 1600, 1150, null);
        } else {
            System.err.println("Image not found: /maquina.png");
        }
        producto.paint(g);
        producto2.paint(g);
        producto3.paint(g);
        producto4.paint(g);
        producto5.paint(g);
        producto6.paint(g);
        producto7.paint(g);
        producto8.paint(g);
        producto9.paint(g);
        producto10.paint(g);
        producto11.paint(g);
        producto12.paint(g);
    }
}