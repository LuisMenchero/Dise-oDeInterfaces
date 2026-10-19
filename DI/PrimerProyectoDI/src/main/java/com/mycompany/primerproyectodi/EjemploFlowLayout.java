/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author m
 */
public class EjemploFlowLayout extends JFrame {
    public EjemploFlowLayout() {
        setTitle("Ejemplo de FlowLayour");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
        
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");
        JButton boton4 = new JButton("Botón 4");
        JButton boton5 = new JButton("Botón 5");
                
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        
        
        setSize(300,150);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new EjemploFlowLayout();
    }
}
