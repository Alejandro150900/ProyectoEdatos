/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro
 */
public class Interfaz {
     JFrame ventana;

    JPanel presentacion;
    JButton iniciar;
    JLabel imagenPresentacion;
    ImageIcon archivo;

    public Interfaz() {

        ventana = new JFrame("Tower Defense");
        ventana.setSize(700, 700);
        ventana.setLayout(null);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        presentacion = new JPanel();
        presentacion.setLayout(null);
        presentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        presentacion.setVisible(true);
        presentacion.setBackground(Color.green);
        ventana.add(presentacion, -1);

        iniciar = new JButton(" Iniciar ");
        iniciar.setBounds(ventana.getWidth() - 430, 260, 150, 30); //coordenas de posicion y tamaño del boton
        iniciar.setVisible(true);
        iniciar.setBackground(Color.white);
        presentacion.add(iniciar, 0);

        imagenPresentacion = new JLabel();
        imagenPresentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        archivo = new ImageIcon("ImagenesProyecto/download _2_.png");
        archivo = new ImageIcon(archivo.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        imagenPresentacion.setIcon(archivo);
        imagenPresentacion.setVisible(true);
        presentacion.add(imagenPresentacion, 0);

        iniciar.addMouseListener(new MouseAdapter() {

            public void MouseInteraccion(MouseEvent e) {
                System.out.println("Iniciar");
            }
        });

        ventana.add(presentacion);

        ventana.setVisible(
                true);

    }
}
