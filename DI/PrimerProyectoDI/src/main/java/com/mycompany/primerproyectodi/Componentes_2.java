/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author m
 */
public class Componentes_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana formulario.");
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal,BoxLayout.Y_AXIS));
        
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new FlowLayout(FlowLayout.CENTER));

        
        JLabel etiqueta = new JLabel ("Nombre: ");
        JTextField campoNombre = new JTextField(15);
        JButton boton = new JButton("Enviar");
        
        panelDatos.add(etiqueta);
        panelDatos.add(campoNombre);
        panelDatos.setMaximumSize(panelDatos.getPreferredSize());
        
        panelPrincipal.add(panelDatos);
        panelPrincipal.add(boton);
        
        frame.add(panelPrincipal);
        frame.setSize(500,500);
        frame.setVisible(true);
        
    }
}
