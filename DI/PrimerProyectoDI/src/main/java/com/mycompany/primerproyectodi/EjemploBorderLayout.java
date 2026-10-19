/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author m
 */
public class EjemploBorderLayout extends JFrame{
    public EjemploBorderLayout() {
        setTitle("Ejemplo de BorderLayour");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5));
        
        JButton botonNorte = new JButton("Norte");
        JButton botonSur = new JButton("Sur");
        JButton botonEste = new JButton("Este");
        JButton botonOeste = new JButton("Oeste");
        JButton botonCentro = new JButton("Centro");
                
        add(botonNorte, BorderLayout.NORTH);
        add(botonSur, BorderLayout.SOUTH);
        add(botonEste, BorderLayout.EAST);
        add(botonOeste, BorderLayout.WEST);
        add(botonCentro, BorderLayout.CENTER);
        
        
        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EjemploBorderLayout();
    }
}
