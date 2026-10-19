/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author m
 */
public class Ejercicio2 {
    static String textoIntroducido;
     public static void main(String[] args) {
        
         
        JFrame ventana = new JFrame();
        JPanel panel = new JPanel(new FlowLayout());
        
        JTextField textoUsuario = new JTextField(20);
        textoUsuario.addActionListener( e -> {
            textoIntroducido = textoUsuario.getText();
            System.out.println("Se ha pulsado el Intro");
        });
        JButton mostrar = new JButton("mostrar");
        mostrar.addActionListener( e -> {
            System.out.println(textoIntroducido);
        });
        
        panel.add(textoUsuario);
        panel.add(mostrar);
        
        
        ventana.add(panel);
        ventana.setSize(300,200);
        ventana.setVisible(true);
    }
}
