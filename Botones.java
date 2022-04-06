import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Botones implements ActionListener{
    int posicion = 0;
    JFrame ventana;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JPanel panelBotones;
    JDialog dialogo;
    JLabel ventana1;

    public Botones(){
        ventana = new JFrame("Tarea Corta 4");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        ventana.setSize(500, 500);
        ventana.setVisible(true);
    }

    private void agregarComponentes(){
        boton1 = new JButton("Boton");
        boton1.addActionListener(this);
        boton1.setBackground(Color.BLUE);
        boton2 = new JButton("Boton");
        boton2.addActionListener(this);
        boton2.setBackground(Color.RED);
        boton3 = new JButton("Boton");
        boton3.addActionListener(this);
        boton3.setBackground(Color.WHITE);

        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 0));

        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);

        ventana.add(panelBotones, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource().equals(boton1)){
                if(posicion == 2){
                    dialogo = new JDialog(ventana, "Final");
                    ventana1 = new JLabel("Felicitaciones el orden de los botones es correcto");
                    dialogo.add(ventana1);
                    dialogo.setSize(300, 150);
                    dialogo.setVisible(true);
                    posicion=0;
                }
                else
                    posicion = Integer.parseInt("h");
            }
            if (e.getSource().equals(boton2)){
                if(posicion == 0)
                    posicion++;
                else
                    posicion = Integer.parseInt("h");
            }
            if (e.getSource().equals(boton3)){
                if(posicion == 1)
                    posicion++;
                else
                    posicion = Integer.parseInt("h");
            }
        }
        catch(NumberFormatException ex){
            dialogo = new JDialog(ventana, "ERROR");
            ventana1 = new JLabel("Seleccionaste el orden incorrecto de los botones");
            dialogo.add(ventana1);
            dialogo.setSize(300, 150);
            dialogo.setVisible(true);
            posicion = 0;
        }
    }
}
