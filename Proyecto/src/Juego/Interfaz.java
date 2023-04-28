/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Alejandro
 */
public class Interfaz {

    //Interfaz
    static JFrame ventana;

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
//    JButton botonVolver;
    static JPanel panelJuego;
    JLabel fondoJuego;
    ImageIcon imagenFondoJuego;
    static int mat[][];
    static JLabel matriz[][];
    int px;
    int py;
    
    int abajo;
    int arriba;
    Timer timer;
    

    /*String jugador;
    JLabel nombre;
    String puntos;*/
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
        px =2;
        py =2;
        //mat[px][py] = 7;
        
        //prueba commit
        //prueba commit 2
        
        
        abajo = 0;
        arriba = 0;

        ventana.add(presentacion);

        ventana.setVisible(true);

    }

    public void jugar() {
        
        
        Sonido sonido = new Sonido();

        sonido.reproducirSonido("SonidosProyecto/Cancion.wav");
        
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
                matriz[i][j].setBounds(50 + (i * 50), 50 + (j * 50), 50, 50);
                matriz[i][j].setVisible(true);
                panelJuego.add(matriz[i][j], 0);

            }

        }
        
       
        //metodo para el boton de volver al menu
        JButton btnVolver = new JButton("Volver al Menú");
        btnVolver.setBounds(ventana.getWidth() - 200, 20, 150, 30);
        btnVolver.setBackground(Color.white);
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MiVentanaEmergente ventanaEmergente = new MiVentanaEmergente(ventana, "¿Estás seguro que quieres volver al menú?");
                ventanaEmergente.setVisible(true);

                if (ventanaEmergente.isConfirmado()) {
                    panelJuego.setVisible(false);
                    menu.setVisible(true);
                }
            }
        });

        
        
        
        //Botones de los personajes
        JButton btnMago = new JButton("Mago");
        btnMago.setBounds(ventana.getWidth() - 200, 200, 150, 40);
        btnMago.setVisible(true);
        btnMago.setBackground(Color.white);
        btnMago.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sonido.reproducirSonido("SonidosProyecto/Mago.Wav");
                JFrame ventanaEmergente = new JFrame("Selección de dirección");
                ventanaEmergente.setSize(300, 100);
                ventanaEmergente.setLocationRelativeTo(null);
                ventanaEmergente.setLayout(new GridLayout(1, 2));

                JButton btnIzquierda = new JButton("Izquierda");
                btnIzquierda.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Aqui va el codigo para cuando seleccionamos izquierda
                        
                        ventanaEmergente.dispose();
                        Mago mag= new Mago(2,9);
                        jugar();
                    }
                });

                JButton btnDerecha = new JButton("Derecha");
                btnDerecha.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Aqui va el codigo para cuando seleccionamos derecha
                        ventanaEmergente.dispose();
                        Mago mag = new Mago(6,9);
                        jugar();
                    }
                });

                ventanaEmergente.add(btnIzquierda);
                ventanaEmergente.add(btnDerecha);
                ventanaEmergente.setVisible(true);
            }
        });

        JButton btnCaballero = new JButton("Caballero");
        btnCaballero.setBounds(ventana.getWidth() - 200, 250, 150, 40);
        btnCaballero.setVisible(true);
        btnCaballero.setBackground(Color.white);
        btnCaballero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sonido.reproducirSonido("SonidosProyecto/Caballero.Wav");
                JFrame ventanaEmergente = new JFrame("Selección de dirección");
                ventanaEmergente.setSize(300, 100);
                ventanaEmergente.setLocationRelativeTo(null);
                ventanaEmergente.setLayout(new GridLayout(1, 2));

                JButton btnIzquierda = new JButton("Izquierda");
                btnIzquierda.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                         // Aqui va el codigo para cuando seleccionamos izquierda
                        ventanaEmergente.dispose();
                        Caballero cab =  new Caballero(2,9);
                        jugar();
                    }
                });

                JButton btnDerecha = new JButton("Derecha");
                btnDerecha.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       // Aqui va el codigo para cuando seleccionamos derecha
                       Caballero cab = new Caballero(6,9);
                        ventanaEmergente.dispose();
                        jugar();
                    }
                });

                ventanaEmergente.add(btnIzquierda);
                ventanaEmergente.add(btnDerecha);
                ventanaEmergente.setVisible(true);
            }
        });

        
        
        
        JButton btnArquero = new JButton("Arquero");
        btnArquero.setBounds(ventana.getWidth() - 200, 300, 150, 40);
        btnArquero.setVisible(true);
        btnArquero.setBackground(Color.white);
        btnArquero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 sonido.reproducirSonido("SonidosProyecto/Arquero.Wav");
                JFrame ventanaEmergente = new JFrame("Selección de dirección");
                ventanaEmergente.setSize(300, 100);
                ventanaEmergente.setLocationRelativeTo(null);
                ventanaEmergente.setLayout(new GridLayout(1, 2));

                JButton btnIzquierda = new JButton("Izquierda");
                btnIzquierda.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Aqui va el codigo para cuando seleccionamos izquierda
                        Arquero arq = new Arquero(2,9);
                        
                        
                        //mat[2][9]=8;
                        ventanaEmergente.dispose();
                        jugar();
                        
                        
                        
                    }
                    
                });

                JButton btnDerecha = new JButton("Derecha");
                btnDerecha.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Aqui va el codigo para cuando seleccionamos derecha
                        //mat[6][9]=8;
                        Arquero arq= new Arquero(6,9);
                        ventanaEmergente.dispose();
                        jugar();
                        
                    }
                });

                ventanaEmergente.add(btnIzquierda);
                ventanaEmergente.add(btnDerecha);
                ventanaEmergente.setVisible(true);
            }
        });

        panelJuego.add(btnVolver);
        panelJuego.add(btnMago);
        panelJuego.add(btnCaballero);
        panelJuego.add(btnArquero);
        ventana.add(panelJuego);//agrega el panel con la matriz 
    }

    public int[][] tablero(int opcion) {
        int[][] aux1 = new int[12][12];
        while (opcion == 1) {
            
            int aux[][] = {
                
                {1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1},
                {1, 2, 7, 1, 1, 1, 5, 1, 1, 1, 2, 1},
                {1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1},
                {1, 6, 1, 1, 1, 1, 4, 1, 1, 1, 6, 1},
                {1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1},
                {1, 2, 8, 1, 1, 1, 5, 1, 1, 1, 2, 1},
                {1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},};
                

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

    //Pantalla emergente para confirmar si se quiere salir al menu
    public class MiVentanaEmergente extends JDialog {

        private boolean confirmado = false;

        public MiVentanaEmergente(JFrame parent, String mensaje) {
            super(parent, "Confirmación", true);

            JPanel panelMensaje = new JPanel();
            panelMensaje.add(new JLabel(mensaje));

            JButton btnConfirmar = new JButton("Confirmar");
            btnConfirmar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    confirmado = true;
                    dispose();
                }
            });

            JButton btnCancelar = new JButton("Cancelar");
            btnCancelar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });

            JPanel panelBotones = new JPanel(new FlowLayout());
            panelBotones.add(btnConfirmar);
            panelBotones.add(btnCancelar);

            getContentPane().add(panelMensaje, BorderLayout.CENTER);
            getContentPane().add(panelBotones, BorderLayout.SOUTH);

            pack();
            setLocationRelativeTo(parent);
        }

        public boolean isConfirmado() {
            return confirmado;
        }
    }

}
