import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fondo extends JPanel implements ActionListener {
    List<productos> listaProducto1 = new ArrayList<>();
    List<productos> listaProducto2 = new ArrayList<>();
    List<productos> listaProducto3 = new ArrayList<>();
    List<productos> listaProducto4 = new ArrayList<>();
    List<productos> listaProducto5 = new ArrayList<>();
    List<productos> listaProducto6 = new ArrayList<>();
    List<productos> listaProducto7 = new ArrayList<>();
    List<productos> listaProducto8 = new ArrayList<>();
    List<productos> listaProducto9 = new ArrayList<>();
    List<productos> listaProducto10 = new ArrayList<>();
    List<productos> listaProducto11 = new ArrayList<>();
    List<productos> listaProducto12 = new ArrayList<>();
    JButton musica, pila, cola, cocacola, monster, leche, chips1, chips2, pollo, pepsi, jugoNaranja, soda, jugoFresa, lecheChocolate, lecheVanilla;
    JLayeredPane layeredPane;
    productos productoSeleccionado;
    int[] contadorProductos = new int[12];

    productos p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;

    boolean pipipi = true;

    public Fondo() {
        JFrame ventana = new JFrame("Juego de la maquina");
        ventana.setSize(600, 815);

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1040, 800);
        ventana.add(layeredPane);

        listaProducto1(new productos(this, "/Imagenes/bebida1.png", 80, 44, 36, 83));


        listaProducto2(new productos(this, "/Imagenes/bebida2.png", 200, 48, 60, 83));
        listaProducto3(new productos(this, "/Imagenes/bebida11.png", 320, 46, 60, 83));

        listaProducto4(new productos(this, "/Imagenes/comida3.png", 80, 160, 64, 88));
        listaProducto5(new productos(this, "/Imagenes/comida4.png", 200, 165, 64, 88));
        listaProducto6(new productos(this, "/Imagenes/comida7.png", 320, 160, 64, 88));

        listaProducto7(new productos(this, "/Imagenes/bebida3.png", 80, 280, 64, 88));
        listaProducto8(new productos(this, "/Imagenes/bebida9.png", 200, 272, 80, 104));
        listaProducto9(new productos(this, "/Imagenes/bebida7.png", 320, 276, 80, 104));

        listaProducto10(new productos(this, "/Imagenes/bebida8.png", 80, 392, 80, 104));
        listaProducto11(new productos(this, "/Imagenes/bebida5.png", 200, 400, 64, 88));
        listaProducto12(new productos(this, "/Imagenes/bebida6.png", 320, 398, 64, 88));

        musica = new JButton("Musika");
        musica.setBounds(442, 32, 135, 56);
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

        cola = new JButton("Ordenar en cola");
        cola.setBounds(440, 490, 135, 56);
        cola.addActionListener(this);
        layeredPane.add(cola, JLayeredPane.PALETTE_LAYER);

        pila = new JButton("Ordenar en pila");
        pila.setBounds(440, 555, 135, 56);
        pila.addActionListener(this);
        layeredPane.add(pila, JLayeredPane.PALETTE_LAYER);


        this.setBounds(0, 0, 1040, 800);
        layeredPane.add(this, JLayeredPane.DEFAULT_LAYER);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    private void listaProducto1(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto1.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto2(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto2.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto3(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto3.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto4(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto4.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto5(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto5.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto6(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto6.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto7(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto7.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto8(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto8.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto9(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto9.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto10(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto10.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto11(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto11.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
        }
    }
    private void listaProducto12(productos producto) {
        for (int i = 0; i < 3; i++) {
            listaProducto12.add(new productos(this, producto.imagenNombre, producto.x, producto.y, producto.ancho, producto.alto));
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
            musica.setEnabled(false);
            Musica.playWAV("src/sonidos/sonido.wav", () -> musica.setEnabled(true));
        } else if (evento.getSource() == cocacola) {
            for (productos p : listaProducto1) {
                p.resetFlag=false;
            }
            int index = contadorProductos[0] % 3;
            productoSeleccionado = listaProducto1.get(index);
            System.out.println("Producto seleccionado: " + productoSeleccionado.imagenNombre + " en el índice: " + index);
            contadorProductos[0]++;

        } else if (evento.getSource() == monster) {
            for (productos p : listaProducto2) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto2.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == leche) {
            for (productos p : listaProducto3) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto3.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == chips1) {
            for (productos p : listaProducto4) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto4.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == chips2) {
            for (productos p : listaProducto5) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto5.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == pollo) {
            for (productos p : listaProducto6) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto6.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == pepsi) {
            for (productos p : listaProducto7) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto7.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == jugoNaranja) {
            for (productos p : listaProducto8) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto8.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == soda) {
            for (productos p : listaProducto9) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto9.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == jugoFresa) {
            for (productos p : listaProducto10) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto10.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == lecheChocolate) {
            for (productos p : listaProducto11) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto11.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        } else if (evento.getSource() == lecheVanilla) {
            for (productos p : listaProducto12) {
                p.resetFlag=false;
            }
            productoSeleccionado = listaProducto12.get(contadorProductos[0] % 3);
            contadorProductos[0]++;
        }
        else if (evento.getSource() == cola) {
            resetProductos();
        }
        else if (evento.getSource() == pila) {
            invertirProductos();
        }
            productoSeleccionado.movimiento();
        repaint();
    }

    private void resetProductos(){
        for (productos p : listaProducto1) {
            p.reset();
        }
        for (productos p : listaProducto2) {
            p.reset();
        }
        for (productos p : listaProducto3) {
            p.reset();
        }
        for (productos p : listaProducto4) {
            p.reset();
        }
        for (productos p : listaProducto5) {
            p.reset();
        }
        for (productos p : listaProducto6) {
            p.reset();
        }
        for (productos p : listaProducto7) {
            p.reset();
        }
        for (productos p : listaProducto8) {
            p.reset();
        }
        for (productos p : listaProducto9) {
            p.reset();
        }
        for (productos p : listaProducto10) {
            p.reset();
        }
        for (productos p : listaProducto11) {
            p.reset();
        }
        for (productos p : listaProducto12) {
            p.reset();
        }
        resetContadorProductosC();
    }


    private void invertirProductos() {
        Collections.reverse(listaProducto1);
        Collections.reverse(listaProducto2);
        Collections.reverse(listaProducto3);
        Collections.reverse(listaProducto4);
        Collections.reverse(listaProducto5);
        Collections.reverse(listaProducto6);
        Collections.reverse(listaProducto7);
        Collections.reverse(listaProducto8);
        Collections.reverse(listaProducto9);
        Collections.reverse(listaProducto10);
        Collections.reverse(listaProducto11);
        Collections.reverse(listaProducto12);
        resetProductos();
        resetContadorProductosP();
    }

    private void resetContadorProductosC() {
        for (int i = 0; i < contadorProductos.length; i++) {
            contadorProductos[i] = 0; // Set to 0 to start from the first index
        }
    }

    private void resetContadorProductosP() {
        for (int i = 0; i < contadorProductos.length; i++) {
            contadorProductos[i] = 2;
        }
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

        for (productos producto : listaProducto10) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto11) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto12) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto7) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto8) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto9) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto4) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto5) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto6) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto2) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto3) {
            if (productoSeleccionado != producto) {
                producto.paint(g);
            }
        }
        for (productos producto : listaProducto1) {
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