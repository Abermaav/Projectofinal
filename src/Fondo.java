import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Fondo extends JPanel implements ActionListener {
    productos producto, producto2, producto3, producto4, producto5, producto6, producto7, producto8, producto9, producto10, producto11, producto12;
    JButton musica, cocacola, monster, leche, chips1, chips2, pollo, pepsi, jugoNaranja, soda, jugoFresa, lecheChocolate, lecheVanilla;
    JLayeredPane layeredPane;
    productos selectedProduct;

    boolean pipipi = true;
    public Fondo() {
        JFrame ventana = new JFrame("Juego de la maquina");
        ventana.setSize(600, 815);

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1040, 800);
        ventana.add(layeredPane);

        producto = new productos(this, "/Imagenes/bebida1.png", 80, 44, 36, 83);
        producto2 = new productos(this, "/Imagenes/bebida2.png", 200, 44, 60, 83);
        producto3 = new productos(this, "/Imagenes/bebida11.png", 320, 44, 60, 83);

        producto4 = new productos(this, "/Imagenes/comida3.png", 80, 160, 64, 88);
        producto5 = new productos(this, "/Imagenes/comida4.png", 200, 160, 64, 88);
        producto6 = new productos(this, "/Imagenes/comida7.png", 320, 160, 64, 88);

        producto7 = new productos(this, "/Imagenes/bebida3.png", 80, 280, 64, 88);
        producto8 = new productos(this, "/Imagenes/bebida9.png", 200, 272, 80, 104);
        producto9 = new productos(this, "/Imagenes/bebida7.png", 320, 276, 80, 104);

        producto10 = new productos(this, "/Imagenes/bebida8.png", 80, 392, 80, 104);
        producto11 = new productos(this, "/Imagenes/bebida5.png", 200, 400, 64, 88);
        producto12 = new productos(this, "/Imagenes/bebida6.png", 320, 398, 64, 88);

        musica = new JButton("Musika");
        musica.setBounds(448, 32, 64, 56);
        musica.addActionListener(this);
        layeredPane.add(musica, JLayeredPane.PALETTE_LAYER);

        cocacola = new JButton();
        cocacola.setBounds(440, 96, 64, 56);
        cocacola.setIcon(imgBotones("/Imagenes/bebida1.png", 40, 56));
        cocacola.setOpaque(true);
        cocacola.setBackground(new Color(0, 0, 0));
        cocacola.addActionListener(this);
        layeredPane.add(cocacola, JLayeredPane.PALETTE_LAYER);

        monster = new JButton();
        monster.setBounds(512, 96, 64, 56);
        monster.setIcon(imgBotones("/Imagenes/bebida2.png", 40, 56));
        monster.setOpaque(true);
        monster.setBackground(new Color(0, 0, 0));
        monster.addActionListener(this);
        layeredPane.add(monster, JLayeredPane.PALETTE_LAYER);

        leche = new JButton();
        leche.setBounds(440, 160, 64, 56);
        leche.setIcon(imgBotones("/Imagenes/bebida11.png", 40, 56));
        leche.setOpaque(true);
        leche.setBackground(new Color(0, 0, 0));
        leche.addActionListener(this);
        layeredPane.add(leche, JLayeredPane.PALETTE_LAYER);

        chips1 = new JButton();
        chips1.setBounds(512, 160, 64, 56);
        chips1.setIcon(imgBotones("/Imagenes/comida3.png", 40, 56));
        chips1.setOpaque(true);
        chips1.setBackground(new Color(0, 0, 0));
        chips1.addActionListener(this);
        layeredPane.add(chips1, JLayeredPane.PALETTE_LAYER);

        chips2 = new JButton();
        chips2.setBounds(440, 224, 64, 56);
        chips2.setIcon(imgBotones("/Imagenes/comida4.png", 40, 56));
        chips2.setOpaque(true);
        chips2.setBackground(new Color(0, 0, 0));
        chips2.addActionListener(this);
        layeredPane.add(chips2, JLayeredPane.PALETTE_LAYER);

        pollo = new JButton();
        pollo.setBounds(512, 224, 64, 56);
        pollo.setIcon(imgBotones("/Imagenes/comida7.png", 40, 56));
        pollo.setOpaque(true);
        pollo.setBackground(new Color(0, 0, 0));
        pollo.addActionListener(this);
        layeredPane.add(pollo, JLayeredPane.PALETTE_LAYER);

        pepsi = new JButton();
        pepsi.setBounds(440, 288, 64, 56);
        pepsi.setIcon(imgBotones("/Imagenes/bebida3.png", 40, 56));
        pepsi.setOpaque(true);
        pepsi.setBackground(new Color(0, 0, 0));
        pepsi.addActionListener(this);
        layeredPane.add(pepsi, JLayeredPane.PALETTE_LAYER);

        jugoNaranja = new JButton();
        jugoNaranja.setBounds(512, 288, 64, 56);
        jugoNaranja.setIcon(imgBotones("/Imagenes/bebida9.png", 40, 56));
        jugoNaranja.setOpaque(true);
        jugoNaranja.setBackground(new Color(0, 0, 0));
        jugoNaranja.addActionListener(this);
        layeredPane.add(jugoNaranja, JLayeredPane.PALETTE_LAYER);

        soda = new JButton();
        soda.setBounds(440, 352, 64, 56);
        soda.setIcon(imgBotones("/Imagenes/bebida7.png", 40, 56));
        soda.setOpaque(true);
        soda.setBackground(new Color(0, 0, 0));
        soda.addActionListener(this);
        layeredPane.add(soda, JLayeredPane.PALETTE_LAYER);

        jugoFresa = new JButton();
        jugoFresa.setBounds(512, 352, 64, 56);
        jugoFresa.setIcon(imgBotones("/Imagenes/bebida8.png", 40, 56));
        jugoFresa.setOpaque(true);
        jugoFresa.setBackground(new Color(0, 0, 0));
        jugoFresa.addActionListener(this);
        layeredPane.add(jugoFresa, JLayeredPane.PALETTE_LAYER);

        lecheChocolate = new JButton();
        lecheChocolate.setBounds(440, 416, 64, 56);
        lecheChocolate.setIcon(imgBotones("/Imagenes/bebida5.png", 40, 56));
        lecheChocolate.setOpaque(true);
        lecheChocolate.setBackground(new Color(0, 0, 0));
        lecheChocolate.addActionListener(this);
        layeredPane.add(lecheChocolate, JLayeredPane.PALETTE_LAYER);

        lecheVanilla = new JButton();
        lecheVanilla.setBounds(512, 416, 64, 56);
        lecheVanilla.setIcon(imgBotones("/Imagenes/bebida6.png", 40, 56));
        lecheVanilla.setOpaque(true);
        lecheVanilla.setBackground(new Color(0, 0, 0));
        lecheVanilla.addActionListener(this);
        layeredPane.add(lecheVanilla, JLayeredPane.PALETTE_LAYER);

        this.setBounds(0, 0, 1040, 800);
        layeredPane.add(this, JLayeredPane.DEFAULT_LAYER);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public ImageIcon imgBotones(String imagen, int ancho, int alto) {
        URL imageUrl = getClass().getResource(imagen);
        if (imageUrl != null) {
            ImageIcon icon1 = new ImageIcon(imageUrl);
            Image imagen1 = icon1.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            return new ImageIcon(imagen1);
        } else {
            System.err.println("Image not found: " + imagen);
            return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == musica) {
            Musica.playWAV("src/sonidos/sonido.wav");
        } else if (evento.getSource() == cocacola) {
            selectedProduct = producto;
        } else if (evento.getSource() == monster) {
            selectedProduct = producto2;
        } else if (evento.getSource() == leche) {
            selectedProduct = producto3;
        } else if (evento.getSource() == chips1) {
            selectedProduct = producto4;
        } else if (evento.getSource() == chips2) {
            selectedProduct = producto5;
        } else if (evento.getSource() == pollo) {
            selectedProduct = producto6;
        } else if (evento.getSource() == pepsi) {
            selectedProduct = producto7;
        } else if (evento.getSource() == jugoNaranja) {
            selectedProduct = producto8;
        } else if (evento.getSource() == soda) {
            selectedProduct = producto9;
        } else if (evento.getSource() == jugoFresa) {
            selectedProduct = producto10;
        } else if (evento.getSource() == lecheChocolate) {
            selectedProduct = producto11;
        } else if (evento.getSource() == lecheVanilla) {
            selectedProduct = producto12;
        }
        if (selectedProduct != null) {
            selectedProduct.movimiento();
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        URL imageUrl = getClass().getResource("/Imagenes/maquinaFondo.png");
        if (imageUrl != null) {
            ImageIcon fondo = new ImageIcon(imageUrl);
            g.drawImage(fondo.getImage(), 8, 8, 1280, 920, null);
        } else {
            System.err.println("Image not found: /maquina.png");
        }

        if (selectedProduct != producto) producto.paint(g);
        if (selectedProduct != producto2) producto2.paint(g);
        if (selectedProduct != producto3) producto3.paint(g);
        if (selectedProduct != producto4) producto4.paint(g);
        if (selectedProduct != producto5) producto5.paint(g);
        if (selectedProduct != producto6) producto6.paint(g);
        if (selectedProduct != producto7) producto7.paint(g);
        if (selectedProduct != producto8) producto8.paint(g);
        if (selectedProduct != producto9) producto9.paint(g);
        if (selectedProduct != producto10) producto10.paint(g);
        if (selectedProduct != producto11) producto11.paint(g);
        if (selectedProduct != producto12) producto12.paint(g);

        if (selectedProduct != null) {
            selectedProduct.paint(g);
        }

        URL imageUrl2 = getClass().getResource("/Imagenes/maquinaDesfondo.png");
        if (imageUrl2 != null) {
            ImageIcon desfondo = new ImageIcon(imageUrl2);
            g.drawImage(desfondo.getImage(), 8, 8, 1280, 920, null);
        } else {
            System.err.println("Image not found: /maquina.png");
        }
    }
}