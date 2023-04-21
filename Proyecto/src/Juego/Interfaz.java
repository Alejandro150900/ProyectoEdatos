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
//import javax.swing.JOptionPane; 
import javax.swing.JPanel;

/**
 *
 * @author Alejandro
 */
public class Interfaz {

    //Interfaz
    JFrame ventana;

    JPanel presentacion;
    JButton iniciar;
    JLabel imagenPresentacion;
    ImageIcon archivo;

    //MENU
    JPanel menu;
    JButton botones[];
    JLabel fondoMenu;
    ImageIcon imagenMenu;

    //juego
    JPanel panelJuego;

    String jugador;
    String puntos;
    int mat[][];
    JLabel nombre;
    JLabel fondoJuego;
    JLabel matriz[][];

    ImageIcon imagenFondoJuego;

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
        iniciar.setBounds(ventana.getWidth() - 430, 500, 150, 30); //coordenas de posicion y tamaño del boton
        iniciar.setVisible(true);
        iniciar.setBackground(Color.white);
        presentacion.add(iniciar, 0);

        imagenPresentacion = new JLabel();
        imagenPresentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        //CAMBIE LA IMAGEN DEL INICIO
        archivo = new ImageIcon("ImagenesProyecto/TowerDefense_inicio.png");
        archivo = new ImageIcon(archivo.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        imagenPresentacion.setIcon(archivo);
        imagenPresentacion.setVisible(true);
        presentacion.add(imagenPresentacion, 0);

        //copiar esto
        //menu
        botones = new JButton[2];
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JButton();

        }

        iniciar.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                System.out.println("Iniciar");
                menu();
                botonesMenu();
            }
        });

        //Juego
        mat = new int[12][12];
        matriz = new JLabel[12][12];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                matriz[i][j] = new JLabel();

            }

        }

        mat = tablero(1);

        ventana.add(presentacion);

        ventana.setVisible(
                true);

    }

    public void jugar() {

        menu.setVisible(false);
        panelJuego = new JPanel();
        panelJuego.setLayout(null);
        panelJuego.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        panelJuego.setVisible(true);

        fondoJuego = new JLabel();
        fondoJuego.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());

        imagenFondoJuego = new ImageIcon("ImagenesProyecto/jugar.png");
        imagenFondoJuego = new ImageIcon(imagenFondoJuego.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoJuego.setIcon(imagenFondoJuego);
        fondoJuego.setVisible(true);
        panelJuego.add(fondoJuego, 0);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                matriz[i][j].setIcon(new ImageIcon("ImagenesProyecto/" + mat[i][j] + ".png"));
                matriz[i][j].setBounds(200 + (i * 50), 200 + (j * 50), 50, 50);
                matriz[i][j].setVisible(true);
                panelJuego.add(matriz[i][j], 0);

            }

        }

        ventana.add(panelJuego);

    }

    public int[][] tablero(int opcion) {
        int[][] aux1 = new int[12][12];
        if (opcion == 1) {

            int aux[][] = {
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 4, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 2},};

            return aux;
        }

        return aux1;
    }

    public void menu() {

        presentacion.setVisible(false);
        menu = new JPanel();
        menu.setLayout(null);
        menu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        menu.setVisible(true);

        fondoMenu = new JLabel();
        fondoMenu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        //CAMBIE LA IMAGEN DEL INICIO
        imagenMenu = new ImageIcon("ImagenesProyecto/TowerDefense_menu.png");
        imagenMenu = new ImageIcon(imagenMenu.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoMenu.setIcon(imagenMenu);
        fondoMenu.setVisible(true);
        menu.add(fondoMenu, 0);

        botones[0].setText("jugar");
        botones[1].setText("Salir");

        for (int i = 0; i < botones.length; i++) {
            botones[i].setBounds(ventana.getWidth() - (200 + 50), (i + 1) * 50, 200, 40);
            botones[i].setVisible(true);
            botones[i].setBackground(Color.white);
            menu.add(botones[i], 0);

        }
        ventana.add(menu);

    }

    public void botonesMenu() {
        //boton jugar
        botones[0].addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                System.out.println("Jugar");
//                jugador = JOptionPane.showInputDialog(ventana, "Nombre del jugador", "Escribe aqui"); //eliminar JOptionPane
//                while (jugador == null || jugador.compareTo("Escribe aqui") == 0 || jugador.compareTo("") == 0) {
//                    jugador = JOptionPane.showInputDialog(ventana, "Debes ingresar usuario", "Escribe aqui");
//                }
                jugar();

            }
        });

        //Boton salir
        botones[1].addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                System.out.println("Salir");
                System.exit(0);
            }
        });

    }
}
