/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author m
 */
public class Componentes_1 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana formulario.");
        ventana.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        
        
        JLabel etiqueta = new JLabel ("Nombre: ");
        JTextField campoNombre = new JTextField(15);
        JButton boton = new JButton("Enviar");
        
        
        ventana.add(etiqueta);
        ventana.add(campoNombre);
        ventana.add(boton);
        
        
        ventana.setSize(500,500);
        ventana.setVisible(true);
        
    }
}
