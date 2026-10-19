package com.mycompany.primerproyectodi;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author m
 */
public class ImagenClic extends JFrame {

    public ImagenClic() {
        setTitle("Ejemplo MouseListener sobre imagen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel labelImagen = new JLabel(new ImageIcon("D:\\Users\\m\\Desktop\\nevado.jpeg"));
        labelImagen.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Has pulsado en la imagen: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Has pulsado con el foco en la imagen");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Has soltado el botón del ratón");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Has entrado en la imagen");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Has salido de la imagen");
            }
        });
        labelImagen.setPreferredSize(new Dimension(250,250));
        add(labelImagen);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        
        
        
        
        ImagenClic imagenClic = new ImagenClic();
    }

}
