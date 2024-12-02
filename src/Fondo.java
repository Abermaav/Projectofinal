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
        musica.setBounds(560, 40, 80, 70);
        musica.addActionListener(this);
        layeredPane.add(musica, JLayeredPane.PALETTE_LAYER);

        cocacola = new JButton();
        cocacola.setBounds(550, 120, 80, 70);
        cocacola.setIcon(imgBotones("/Imagenes/bebida1.png", 50, 70));
        cocacola.setOpaque(true);
        cocacola.setBackground(new Color(0, 0, 0));
        cocacola.addActionListener(this);
        layeredPane.add(cocacola, JLayeredPane.PALETTE_LAYER);

        monster = new JButton();
        monster.setBounds(640, 120, 80, 70);
        monster.setIcon(imgBotones("/Imagenes/bebida2.png", 50, 70));
        monster.setOpaque(true);
        monster.setBackground(new Color(0, 0, 0));
        monster.addActionListener(this);
        layeredPane.add(monster, JLayeredPane.PALETTE_LAYER);

        leche = new JButton();
        leche.setBounds(550, 200, 80, 70);
        leche.setIcon(imgBotones("/Imagenes/bebida11.png", 50, 70));
        leche.setOpaque(true);
        leche.setBackground(new Color(0, 0, 0));
        leche.addActionListener(this);
        layeredPane.add(leche, JLayeredPane.PALETTE_LAYER);

        chips1 = new JButton();
        chips1.setBounds(640, 200, 80, 70);
        chips1.setIcon(imgBotones("/Imagenes/comida3.png", 50, 70));
        chips1.setOpaque(true);
        chips1.setBackground(new Color(0, 0, 0));
        chips1.addActionListener(this);
        layeredPane.add(chips1, JLayeredPane.PALETTE_LAYER);

        chips2 = new JButton();
        chips2.setBounds(550, 280, 80, 70);
        chips2.setIcon(imgBotones("/Imagenes/comida4.png", 50, 70));
        chips2.setOpaque(true);
        chips2.setBackground(new Color(0, 0, 0));
        chips2.addActionListener(this);
        layeredPane.add(chips2, JLayeredPane.PALETTE_LAYER);

        pollo = new JButton();
        pollo.setBounds(640, 280, 80, 70);
        pollo.setIcon(imgBotones("/Imagenes/comida7.png", 50, 70));
        pollo.setOpaque(true);
        pollo.setBackground(new Color(0, 0, 0));
        pollo.addActionListener(this);
        layeredPane.add(pollo, JLayeredPane.PALETTE_LAYER);

        pepsi = new JButton();
        pepsi.setBounds(550, 360, 80, 70);
        pepsi.setIcon(imgBotones("/Imagenes/bebida3.png", 50, 70));
        pepsi.setOpaque(true);
        pepsi.setBackground(new Color(0, 0, 0));
        pepsi.addActionListener(this);
        layeredPane.add(pepsi, JLayeredPane.PALETTE_LAYER);

        jugoNaranja = new JButton();
        jugoNaranja.setBounds(640, 360, 80, 70);
        jugoNaranja.setIcon(imgBotones("/Imagenes/bebida9.png", 50, 70));
        jugoNaranja.setOpaque(true);
        jugoNaranja.setBackground(new Color(0, 0, 0));
        jugoNaranja.addActionListener(this);
        layeredPane.add(jugoNaranja, JLayeredPane.PALETTE_LAYER);

        soda = new JButton();
        soda.setBounds(550, 440, 80, 70);
        soda.setIcon(imgBotones("/Imagenes/bebida7.png", 50, 70));
        soda.setOpaque(true);
        soda.setBackground(new Color(0, 0, 0));
        soda.addActionListener(this);
        layeredPane.add(soda, JLayeredPane.PALETTE_LAYER);

        jugoFresa = new JButton();
        jugoFresa.setBounds(640, 440, 80, 70);
        jugoFresa.setIcon(imgBotones("/Imagenes/bebida8.png", 50, 70));
        jugoFresa.setOpaque(true);
        jugoFresa.setBackground(new Color(0, 0, 0));
        jugoFresa.addActionListener(this);
        layeredPane.add(jugoFresa, JLayeredPane.PALETTE_LAYER);

        lecheChocolate = new JButton();
        lecheChocolate.setBounds(550, 520, 80, 70);
        lecheChocolate.setIcon(imgBotones("/Imagenes/bebida5.png", 50, 70));
        lecheChocolate.setOpaque(true);
        lecheChocolate.setBackground(new Color(0, 0, 0));
        lecheChocolate.addActionListener(this);
        layeredPane.add(lecheChocolate, JLayeredPane.PALETTE_LAYER);

        lecheVanilla = new JButton();
        lecheVanilla.setBounds(640, 520, 80, 70);
        lecheVanilla.setIcon(imgBotones("/Imagenes/bebida6.png", 50, 70));
        lecheVanilla.setOpaque(true);
        lecheVanilla.setBackground(new Color(0, 0, 0));
        lecheVanilla.addActionListener(this);
        layeredPane.add(lecheVanilla, JLayeredPane.PALETTE_LAYER);

        this.setBounds(0, 0, 1300, 1000);
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
            g.drawImage(fondo.getImage(), 10, 10, 1600, 1150, null);
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

        // Draw the selected product last
        if (selectedProduct != null) {
            selectedProduct.paint(g);
        }

        URL imageUrl2 = getClass().getResource("/Imagenes/maquinaDesfondo.png");
        if (imageUrl2 != null) {
            ImageIcon desfondo = new ImageIcon(imageUrl2);
            g.drawImage(desfondo.getImage(), 10, 10, 1600, 1150, null);
        } else {
            System.err.println("Image not found: /maquina.png");
        }
    }
}