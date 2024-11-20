import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Fondo extends JPanel implements ActionListener {
    productos producto;
    JButton musica, cocacola;
    JLayeredPane layeredPane;
    JLabel salida;

    public Fondo() {
        JFrame ventana = new JFrame("Juego de la maquina");
        ventana.setSize(700, 730);

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 700, 730);
        ventana.add(layeredPane);

        producto = new productos(this);

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

        this.setBounds(0, 0, 700, 730);
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
        URL imageUrl = getClass().getResource("/Imagenes/maquina.png");
        if (imageUrl != null) {
            ImageIcon fondo = new ImageIcon(imageUrl);
            g.drawImage(fondo.getImage(), 0, 0, 700, 700, null);
        } else {
            System.err.println("Image not found: /maquina.png");
        }
        producto.paint(g);
    }
}