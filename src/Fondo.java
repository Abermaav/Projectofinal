import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Fondo extends JPanel implements ActionListener {
    productos producto;
JButton musica, cocacola;
    public Fondo() {
        JFrame ventana = new JFrame("Juego de la maquina");
        ventana.setSize(700, 730);

        producto = new productos(this);

        musica = new JButton("Musika");
        musica.setBounds(500, 20, 80, 70);
        musica.addActionListener(this);
        ventana.add(musica);

        cocacola = new JButton("coca cola");
        cocacola.setBounds(500, 100, 80, 70);
        cocacola.addActionListener(this);
        ventana.add(cocacola);



        ventana.add(this);
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
            ImageIcon tela = new ImageIcon(imageUrl);
            g.drawImage(tela.getImage(), 0, 0, 700, 700, null);
        } else {
            System.err.println("Image not found: /maquina.png");
        }
        producto.paint(g);


    }
}
