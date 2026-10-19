/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author m
 */
public class Ejemplo3Boton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo3 - JDialog no modal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        
        JButton boton = new JButton("Abrir dialogo");
        boton.addActionListener(e -> abrirDialogo(frame));
        
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Estoy dentro de un JPanel"));
        
        panel.add(boton);
        frame.add(panel);
        frame.setVisible(true);
    }
    
    private static void abrirDialogo(JFrame padre) {
        JDialog dialogo = new JDialog(padre,"Ejemplo3 - JDialog no modal", false);
        dialogo.setSize(400,300);
        dialogo.setLocationRelativeTo(padre);
        
       
        
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Puedes seguir usando el JFrame"));
        
        dialogo.add(panel);
        dialogo.setVisible(true);
    }
}
