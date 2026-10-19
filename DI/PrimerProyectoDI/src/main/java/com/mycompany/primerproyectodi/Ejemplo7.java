/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author m
 */
public class Ejemplo7 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        //menu de opciones
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        menuArchivo.add(new JMenuItem("Nuevo"));
        menuArchivo.add(new JMenuItem("Salir"));

        JMenu menuAyuda = new JMenu("Ayuda");
        menuAyuda.add(new JMenuItem("Acerca de"));

        barraMenu.add(menuArchivo);
        barraMenu.add(menuAyuda);
        ventana.setJMenuBar(barraMenu);
        ventana.setSize(500,500);
        ventana.setVisible(true);
    }
}
