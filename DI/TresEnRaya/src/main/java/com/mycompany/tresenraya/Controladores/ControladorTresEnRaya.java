/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tresenraya.Controladores;

import com.mycompany.tresenraya.Vistas.PantallaFinalPartida;
import com.mycompany.tresenraya.Vistas.PantallaPrincipal;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author m
 */
public class ControladorTresEnRaya {

    public static PantallaPrincipal pantallaPrincipal;
    private static int ronda = 1;
    private static JButton[] panelPartida;
    private static boolean[] botonesPulsados;
    private static int numJugadorGanador;

    public static void iniciar() {
        pantallaPrincipal = new PantallaPrincipal();

        panelPartida = new JButton[]{pantallaPrincipal.getjButton1(),
            pantallaPrincipal.getjButton2(),
            pantallaPrincipal.getjButton3(),
            pantallaPrincipal.getjButton4(),
            pantallaPrincipal.getjButton5(),
            pantallaPrincipal.getjButton6(),
            pantallaPrincipal.getjButton7(),
            pantallaPrincipal.getjButton8(),
            pantallaPrincipal.getjButton9(),};
        botonesPulsados = new boolean[]{false, false, false, false, false, false, false, false, false};

        pantallaPrincipal.setVisible(true);
    }

    public static void colocarFicha(int numeroPosicion) {
        if (!botonesPulsados[numeroPosicion]) {
            if (ronda % 2 == 0) {
                panelPartida[numeroPosicion].setBackground(Color.red);
            } else {
                panelPartida[numeroPosicion].setBackground(Color.blue);
            }

            botonesPulsados[numeroPosicion] = true;
            comprobarFinalPartida();
            ronda++;
        } else {
            System.out.println("ya se ha colocado una ficha en esa posicion");
        }
    }

    private static void mostrarFinPartida() {
        PantallaFinalPartida pfp = new PantallaFinalPartida(pantallaPrincipal, true);
        pfp.setLocationRelativeTo(pantallaPrincipal);
        pfp.setVisible(true);
    }

    private static void comprobarFinalPartida() {
        // Comprobar horizontales
        // Fila 1
        if (panelPartida[0].getBackground().equals(Color.blue) && panelPartida[1].getBackground().equals(Color.blue) && panelPartida[2].getBackground().equals(Color.blue)) {
            numJugadorGanador = 1;
            mostrarFinPartida();
        }
        if (panelPartida[0].getBackground().equals(Color.red) && panelPartida[1].getBackground().equals(Color.red) && panelPartida[2].getBackground().equals(Color.red)) {
            numJugadorGanador = 2;
            mostrarFinPartida();
        }

        // Fila 2
        if (panelPartida[3].getBackground().equals(Color.blue) && panelPartida[4].getBackground().equals(Color.blue) && panelPartida[5].getBackground().equals(Color.blue)) {
            numJugadorGanador = 1;
            mostrarFinPartida();
        }
        if (panelPartida[3].getBackground().equals(Color.red) && panelPartida[4].getBackground().equals(Color.red) && panelPartida[5].getBackground().equals(Color.red)) {
            numJugadorGanador = 2;
            mostrarFinPartida();
        }

        // Fila 3
        if (panelPartida[6].getBackground().equals(Color.blue) && panelPartida[7].getBackground().equals(Color.blue) && panelPartida[8].getBackground().equals(Color.blue)) {
            numJugadorGanador = 1;
            mostrarFinPartida();
        }
        if (panelPartida[6].getBackground().equals(Color.red) && panelPartida[7].getBackground().equals(Color.red) && panelPartida[8].getBackground().equals(Color.red)) {
            numJugadorGanador = 2;
            mostrarFinPartida();
        }

        // Comprobar verticales
        // Columna 1
        if (panelPartida[0].getBackground().equals(Color.blue) && panelPartida[3].getBackground().equals(Color.blue) && panelPartida[6].getBackground().equals(Color.blue)) {
            numJugadorGanador = 1;
            mostrarFinPartida();
        }
        if (panelPartida[0].getBackground().equals(Color.red) && panelPartida[3].getBackground().equals(Color.red) && panelPartida[6].getBackground().equals(Color.red)) {
            numJugadorGanador = 2;
            mostrarFinPartida();
        }

        // Columna 2
        if (panelPartida[1].getBackground().equals(Color.blue) && panelPartida[4].getBackground().equals(Color.blue) && panelPartida[7].getBackground().equals(Color.blue)) {
            numJugadorGanador = 1;
            mostrarFinPartida();
        }
        if (panelPartida[1].getBackground().equals(Color.red) && panelPartida[4].getBackground().equals(Color.red) && panelPartida[7].getBackground().equals(Color.red)) {
            numJugadorGanador = 2;
            mostrarFinPartida();
        }

        // Columna 3
        if (panelPartida[2].getBackground().equals(Color.blue) && panelPartida[5].getBackground().equals(Color.blue) && panelPartida[8].getBackground().equals(Color.blue)) {
            numJugadorGanador = 1;
            mostrarFinPartida();
        }
        if (panelPartida[2].getBackground().equals(Color.red) && panelPartida[5].getBackground().equals(Color.red) && panelPartida[8].getBackground().equals(Color.red)) {
            numJugadorGanador = 2;
            mostrarFinPartida();
        }

        // DIAGONALES
        // Diagonal 1
        if (panelPartida[0].getBackground().equals(Color.blue) && panelPartida[4].getBackground().equals(Color.blue) && panelPartida[8].getBackground().equals(Color.blue)) {
            numJugadorGanador = 1;
            mostrarFinPartida();
        }
        if (panelPartida[0].getBackground().equals(Color.red) && panelPartida[4].getBackground().equals(Color.red) && panelPartida[8].getBackground().equals(Color.red)) {
            numJugadorGanador = 2;
            mostrarFinPartida();
        }

        // Diagonal 2
        if (panelPartida[2].getBackground().equals(Color.blue) && panelPartida[4].getBackground().equals(Color.blue) && panelPartida[6].getBackground().equals(Color.blue)) {
            numJugadorGanador = 1;
            mostrarFinPartida();
        }
        if (panelPartida[2].getBackground().equals(Color.red) && panelPartida[4].getBackground().equals(Color.red) && panelPartida[6].getBackground().equals(Color.red)) {
            numJugadorGanador = 2;
            mostrarFinPartida();
        }

        // Empate
        if (botonesPulsados[0] && botonesPulsados[1] && botonesPulsados[2] && botonesPulsados[3] && botonesPulsados[4] && botonesPulsados[5] && botonesPulsados[6] && botonesPulsados[7] && botonesPulsados[8]) {
            numJugadorGanador = 0;
            mostrarFinPartida();
        }
    }

    public static void reiniciarPartida() {
        ronda = 1;
        for (int i = 0; i < 9; i++) {
            panelPartida[i].setBackground(Color.white);
            botonesPulsados[i] = false;
        }
    }

    public static int getNumJugadorGanador() {
        return numJugadorGanador;
    }

}
