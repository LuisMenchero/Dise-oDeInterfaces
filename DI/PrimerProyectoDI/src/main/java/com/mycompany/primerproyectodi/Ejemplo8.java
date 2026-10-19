/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;

import java.awt.BorderLayout;
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
public class Ejemplo8 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Eventos en java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelBotones = new JPanel(new FlowLayout());

        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");

        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);

        JLabel etiqueta = new JLabel("Pulsa un botón", JLabel.CENTER);

        frame.setLayout(new BorderLayout());
        frame.add(panelBotones, BorderLayout.NORTH);
        frame.add(etiqueta, BorderLayout.CENTER);

        // Clase que implementa ActionListener
        boton1.addActionListener(new BotonSaludo(etiqueta));

        // Clase anónima
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Has pulsado el botón 2");
            }
        });
        
        // Lamba
        boton3.addActionListener(e ->{
            etiqueta.setText("Has pulsado el botón 3");
        });
        

        frame.setSize(500, 200);
        frame.setVisible(true);

    }

    private static class BotonSaludo implements ActionListener {

        private final JLabel etiqueta;

        public BotonSaludo(JLabel etiqueta) {

            this.etiqueta = etiqueta;
        }

        @Override

        public void actionPerformed(ActionEvent e) {
            etiqueta.setText("Has pulsado el botón 1");

        }

    }

}
