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

/**
 *
 * @author m
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        JPanel panel = new JPanel(new FlowLayout());
        
        JLabel contadorClicks = new JLabel("Clicks = 0");
        JButton botonClicks = new JButton("Pulsame para añadir un click");
        
        botonClicks.addActionListener(new ActionListener() {
            int numeroClicks = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroClicks++;
                contadorClicks.setText("Clicks = " + numeroClicks);
            }
        });
        
        panel.add(botonClicks);
        panel.add(contadorClicks);
        
        
        ventana.add(panel);
        ventana.setSize(300,200);
        ventana.setVisible(true);
    }
}
