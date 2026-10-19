/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora.controladores;

import com.mycompany.calculadora.vista.PantallaPrincipal;
import java.awt.event.KeyEvent;

/**
 *
 * @author LuisM
 */
public class ControladorCalculadora {

    private PantallaPrincipal pantallaPrincipal;
    private double resultado;
    private String operacionPendiente;
    private boolean esNuevoNumero;

    public ControladorCalculadora(PantallaPrincipal pantallaPrincipal) {
        this.pantallaPrincipal = pantallaPrincipal;
        resultado = 0;
        operacionPendiente = "=";
        esNuevoNumero = true;
    }

    public void escribirNumero(String numeroIntroducido) {
        if (pantallaPrincipal.getjTextFieldOperaciones().getText().equals("0") || esNuevoNumero) {
            pantallaPrincipal.getjTextFieldOperaciones().setText(numeroIntroducido);
            esNuevoNumero = false;
        } else {
            pantallaPrincipal.getjTextFieldOperaciones().setText(pantallaPrincipal.getjTextFieldOperaciones().getText() + numeroIntroducido);
        }
    }

    public void eventoDecimal() {

        if (esNuevoNumero) {
            pantallaPrincipal.getjTextFieldOperaciones().setText("0.");
            esNuevoNumero = false;
            return;
        }

        String textoAct = pantallaPrincipal.getjTextFieldOperaciones().getText();

        if (!textoAct.contains(".")) {
            pantallaPrincipal.getjTextFieldOperaciones().setText(textoAct + ".");
        }
    }

    public void eventosOperaciones(String simboloOperacion) {
        double numNuevo = Double.parseDouble(pantallaPrincipal.getjTextFieldOperaciones().getText());

        calcular(numNuevo);

        operacionPendiente = simboloOperacion;
        esNuevoNumero = true;
    }

    public void calcular(double numero) {
        if (operacionPendiente.equals("=")) {
            resultado = numero;
            return;
        }

        if (operacionPendiente.equals("+")) {
            resultado = resultado + numero;
        } else if (operacionPendiente.equals("-")) {
            resultado = resultado - numero;
        } else if (operacionPendiente.equals("*")) {
            resultado = resultado * numero;
        } else if (operacionPendiente.equals("/")) {
            resultado = resultado / numero;
        }
    }

    public void resultado() {
        double numeroPantalla = Double.parseDouble(pantallaPrincipal.getjTextFieldOperaciones().getText());

        calcular(numeroPantalla);

        pantallaPrincipal.getjTextFieldOperaciones().setText(String.valueOf(resultado));

        operacionPendiente = "=";
        esNuevoNumero = true;
    }

    public void limpiar() {
        pantallaPrincipal.getjTextFieldOperaciones().setText("0");
        operacionPendiente = "=";
        esNuevoNumero = true;
    }

    public void teclaPulsada(KeyEvent evt) {
        char letra = evt.getKeyChar();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            resultado();
            return;
        } else if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            limpiar();
            return;
        }

        switch (letra) {
            case '0':
                escribirNumero(String.valueOf(letra));
                break;
            case '1':
                escribirNumero(String.valueOf(letra));
                break;
            case '2':
                escribirNumero(String.valueOf(letra));
                break;
            case '3':
                escribirNumero(String.valueOf(letra));
                break;
            case '4':
                escribirNumero(String.valueOf(letra));
                break;
            case '5':
                escribirNumero(String.valueOf(letra));
                break;
            case '6':
                escribirNumero(String.valueOf(letra));
                break;
            case '7':
                escribirNumero(String.valueOf(letra));
                break;
            case '8':
                escribirNumero(String.valueOf(letra));
                break;
            case '9':
                escribirNumero(String.valueOf(letra));
                break;

            case '+':
                eventosOperaciones(String.valueOf(letra));
                break;
            case '-':
                eventosOperaciones(String.valueOf(letra));
                break;
            case '*':
                eventosOperaciones(String.valueOf(letra));
                break;
            case '/':
                eventosOperaciones(String.valueOf(letra));
                break;
            case '.':
                eventoDecimal();
                break;
            case ',':
                eventoDecimal();
                break;
        }
    }
}
