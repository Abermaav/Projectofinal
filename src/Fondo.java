import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Fondo extends JPanel implements ActionListener {
    List<productos> listaProductos = new ArrayList<>();
    JButton musica, cocacola, monster, leche, chips1, chips2, pollo, pepsi, jugoNaranja, soda, jugoFresa, lecheChocolate, lecheVanilla;
    JLayeredPane layeredPane;
    productos productoSeleccionado;

    boolean pipipi = true;

    public Fondo() {
        JFrame ventana = new JFrame("Juego de la maquina");
        ventana.setSize(600, 815);

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1040, 800);
        ventana.add(layeredPane);

        listaProductos(new productos(this, "/Imagenes/bebida1.png", 80, 44, 36, 83));
        listaProductos(new productos(this, "/Imagenes/bebida2.png", 200, 44, 60, 83));
        listaProductos(new productos(this, "/Imagenes/bebida11.png", 320, 44, 60, 83));

        listaProductos(new productos(this, "/Imagenes/comida3.png", 80, 160, 64, 88));
        listaProductos(new productos(this, "/Imagenes/comida4.png", 200, 160, 64, 88));
        listaProductos(new productos(this, "/Imagenes/comida7.png", 320, 160, 64, 88));

        listaProductos(new productos(this, "/Imagenes/bebida3.png", 80, 280, 64, 88));
        listaProductos(new productos(this, "/Imagenes/bebida9.png", 200, 272, 80, 104));
        listaProductos(new productos(this, "/Imagenes/bebida7.png", 320, 276, 80, 104));

        listaProductos(new productos(this, "/Imagenes/bebida8.png", 80, 392, 80, 104));
        listaProductos(new productos(this, "/Imagenes/bebida5.png", 200, 400, 64, 88));
        listaProductos(new productos(this, "/Imagenes/bebida6.png", 320, 398, 64, 88));

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

    private void listaProductos(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProductos.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
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
            productoSeleccionado = listaProductos.get(0);
        } else if (evento.getSource() == monster) {
            productoSeleccionado = listaProductos.get(3);
        } else if (evento.getSource() == leche) {
            productoSeleccionado = listaProductos.get(6);
        } else if (evento.getSource() == chips1) {
            productoSeleccionado = listaProductos.get(9);
        } else if (evento.getSource() == chips2) {
            productoSeleccionado = listaProductos.get(12);
        } else if (evento.getSource() == pollo) {
            productoSeleccionado = listaProductos.get(15);
        } else if (evento.getSource() == pepsi) {
            productoSeleccionado = listaProductos.get(18);
        } else if (evento.getSource() == jugoNaranja) {
            productoSeleccionado = listaProductos.get(21);
        } else if (evento.getSource() == soda) {
            productoSeleccionado = listaProductos.get(24);
        } else if (evento.getSource() == jugoFresa) {
            productoSeleccionado = listaProductos.get(27);
        } else if (evento.getSource() == lecheChocolate) {
            productoSeleccionado = listaProductos.get(30);
        } else if (evento.getSource() == lecheVanilla) {
            productoSeleccionado = listaProductos.get(33);
        }
        if (productoSeleccionado != null) {
            productoSeleccionado.movimiento();
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

        for (productos producto : listaProductos) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }

        if (productoSeleccionado != null) {
            productoSeleccionado.paint(g);
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