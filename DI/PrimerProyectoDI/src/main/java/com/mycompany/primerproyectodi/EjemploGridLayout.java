/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author m
 */
public class EjemploGridLayout extends JFrame{
    public EjemploGridLayout() {
        setTitle("Ejemplo de GridLayour");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(3,3,5,5));
        
        for (int i = 1 ; i<= 9; i++) {
            JButton boton = new JButton(String.valueOf(i));
            add(boton);
        }
        
        setSize(250,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EjemploGridLayout();
    }
}
