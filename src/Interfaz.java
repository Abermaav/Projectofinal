/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame implements ActionListener {
    JLabel lmaquina, lbebida1, lbebida2, lbebida3, lbebida4, lbebida5, lbebida6, lbebida7, lbebida8, lbebida9, lbebida10, lbebida11, lbebida12;
    JLabel lcomida1, lcomida2, lcomida3, lcomida4, lcomida5, lcomida6, lcomida7;
    JLabel salida;
    JButton musica, cocacola;
    int bebida1Y=34;

    Interfaz() {
        setTitle("Maquina expendedora");
        setSize(650, 798);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        lmaquina = new JLabel();
        lmaquina.setBounds(0, 0, 680, 770);
        lmaquina.setIcon(new Imagenes("src/imagenes/maquina.png", 650, 770).getImagen());
        add(lmaquina);

        lbebida1 = new JLabel();
        lbebida1.setBounds(130, bebida1Y, 40, 80);
        lbebida1.setIcon(new Imagenes("src/imagenes/bebida1.png", 40, 80).getImagen());
        lmaquina.add(lbebida1);

        lcomida1 = new JLabel();
        lcomida1.setBounds(110, 120, 70, 80);
        lcomida1.setIcon(new Imagenes("src/imagenes/comida1.png", 70, 60).getImagen());
        lmaquina.add(lcomida1);

        lbebida2 = new JLabel();
        lbebida2.setBounds(120, 195, 70, 80);
        lbebida2.setIcon(new Imagenes("src/imagenes/bebida2.png", 60, 70).getImagen());
        lmaquina.add(lbebida2);

        lcomida2 = new JLabel();
        lcomida2.setBounds(110, 280, 100, 100);
        lcomida2.setIcon(new Imagenes("src/imagenes/comida2.png", 90, 100).getImagen());
        lmaquina.add(lcomida2);

        lbebida3 = new JLabel();
        lbebida3.setBounds(120, 380, 70, 80);
        lbebida3.setIcon(new Imagenes("src/imagenes/bebida3.png", 60, 70).getImagen());
        lmaquina.add(lbebida3);

        lcomida3 = new JLabel();
        lcomida3.setBounds(120, 450, 100, 100);
        lcomida3.setIcon(new Imagenes("src/imagenes/comida3.png", 55, 75).getImagen());
        lmaquina.add(lcomida3);

        lbebida4 = new JLabel();
        lbebida4.setBounds( 235, 34, 70, 80);
        lbebida4.setIcon(new Imagenes("src/imagenes/bebida4.png", 65, 80).getImagen());
        lmaquina.add(lbebida4);

        lcomida4 = new JLabel();
        lcomida4.setBounds(235, 116, 70, 80);
        lcomida4.setIcon(new Imagenes("src/imagenes/comida4.png", 60, 70).getImagen());
        lmaquina.add(lcomida4);

        lbebida5 = new JLabel();
        lbebida5.setBounds(235, 192, 70, 80);
        lbebida5.setIcon(new Imagenes("src/imagenes/bebida5.png", 70, 80).getImagen());
        lmaquina.add(lbebida5);

        lcomida5 = new JLabel();
        lcomida5.setBounds(215, 250, 140, 150);
        lcomida5.setIcon(new Imagenes("src/imagenes/comida5.png", 120, 130).getImagen());
        lmaquina.add(lcomida5);

        lbebida6 = new JLabel();
        lbebida6.setBounds(235, 380, 60, 70);
        lbebida6.setIcon(new Imagenes("src/imagenes/bebida6.png", 70, 80).getImagen());
        lmaquina.add(lbebida6);

        lcomida6 = new JLabel();
        lcomida6.setBounds(235, 450, 90, 100);
        lcomida6.setIcon(new Imagenes("src/imagenes/comida6.png", 75, 90).getImagen());
        lmaquina.add(lcomida6);

        lbebida7 = new JLabel();
        lbebida7.setBounds(350, 34, 70, 80);
        lbebida7.setIcon(new Imagenes("src/imagenes/bebida7.png", 70, 80).getImagen());
        lmaquina.add(lbebida7);

        lcomida7 = new JLabel();
        lcomida7.setBounds(350, 116, 70, 80);
        lcomida7.setIcon(new Imagenes("src/imagenes/comida7.png", 70, 80).getImagen());
        lmaquina.add(lcomida7);

        lbebida8 = new JLabel();
        lbebida8.setBounds(350, 192, 70, 80);
        lbebida8.setIcon(new Imagenes("src/imagenes/bebida8.png", 70, 80).getImagen());
        lmaquina.add(lbebida8);

        lbebida9 = new JLabel();
        lbebida9.setBounds(350, 380, 70, 80);
        lbebida9.setIcon(new Imagenes("src/imagenes/bebida9.png", 70, 80).getImagen());
        lmaquina.add(lbebida9);

        lbebida10 = new JLabel();
        lbebida10.setBounds(350, 450, 70, 80);
        lbebida10.setIcon(new Imagenes("src/imagenes/bebida10.png", 70, 80).getImagen());
        lmaquina.add(lbebida10);

        lbebida11 = new JLabel();
        lbebida11.setBounds(350, 285, 70, 80);
        lbebida11.setIcon(new Imagenes("src/imagenes/bebida11.png", 70, 80).getImagen());
        lmaquina.add(lbebida11);

        lbebida12 = new JLabel();
        lbebida12.setBounds(355, 460, 70, 80);
        lbebida12.setIcon(new Imagenes("src/imagenes/bebida12.png", 55, 70).getImagen());
        lmaquina.add(lbebida12);

        salida = new JLabel();
        salida.setBounds(100, 600, 350, 100);
        salida.setBackground(new Color(93, 57, 135));
        salida.setOpaque(true);
        lmaquina.add(salida);

        musica = new JButton();
        musica.setBounds(480, 30, 90, 50);
        musica.setText("Musika");
        musica.setBackground(new Color(246, 246, 246));
        musica.addActionListener(this);
        lmaquina.add(musica);

        cocacola = new JButton();
        cocacola.setBounds(480, 120, 90, 50);
        cocacola.setText("Cocacola");
        cocacola.setBackground(new Color(246, 246, 246));
        cocacola.addActionListener(this);
        lmaquina.add(cocacola);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == musica) {
            Musica.playWAV("src/sonidos/sonido.wav");
        }
        if (evento.getSource() == cocacola) {
            bebida1Y+=2;
        }



    }
}

 */

