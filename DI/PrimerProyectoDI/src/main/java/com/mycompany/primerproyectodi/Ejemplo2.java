/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 *
 * @author m
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo2 - JFrame con JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Estoy dentro de un JPanel"));
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
