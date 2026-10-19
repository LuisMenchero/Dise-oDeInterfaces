/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyectodi;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author m
 */
public class Ejemplo6 {
    public static void main(String[] args) {
  
        JFrame frame = new JFrame("Componentes basicos swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);        
        
        // --- Panel superior: etiqueta, campo de texto y boton ---
        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Entrada de texto"));
        JLabel etiqueta = new JLabel("Escribe algo:");
        JTextField campoTexto = new JTextField(15);
        JButton boton = new JButton("Añadir");
        
        
        panelSuperior.add(etiqueta);
        panelSuperior.add(campoTexto);
        panelSuperior.add(boton);
        
        // --- Panel central: area de texto ---
        JTextArea areaTexto = new JTextArea(6,30);
        areaTexto.setEditable(false);
        areaTexto.setText("Area de texto no editable de momento");
        
        // --- Panel de opciones en la parte sur ---
        JPanel panelOpciones = new JPanel(new GridLayout(4,1,5,5));
        panelOpciones.setBorder(BorderFactory.createTitledBorder("Opciones"));
        
        JCheckBox checkAceptar = new JCheckBox("Acepto los Términos");
        
        JRadioButton radioOpcion1 = new JRadioButton("Opcion 1",true); // Opcion por defecto        
        JRadioButton radioOpcion2 = new JRadioButton("Opcion 2");
        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(radioOpcion1);
        grupoRadio.add(radioOpcion2);
        
        String[] elementos = {"Java", "Python", "JavaScript","C#"};
        JComboBox<String> comboLenguajes = new JComboBox<>(elementos);
        
        panelOpciones.add(checkAceptar);
        panelOpciones.add(radioOpcion1);
        panelOpciones.add(radioOpcion2);
        panelOpciones.add(comboLenguajes);
        
        
        // --- Panel inferior ---
        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.setBorder(BorderFactory.createTitledBorder("Otros componentes"));
        JPasswordField campoPassword = new JPasswordField(10);
        JSlider slider = new JSlider(0,100,50); // Numero minimo, numero maximo, numero inicial
        JProgressBar progressBar = new JProgressBar(0,100); // Numero minimo, numero maximo
        progressBar.setValue(70);
        progressBar.setStringPainted(true);
        
        panelInferior.add(new JLabel("Contraseña:"));
        panelInferior.add(campoPassword);
        panelInferior.add(slider);
        panelInferior.add(progressBar);
        
        
        
        // --- JUNTAR LOS PANELES OPCIONES + INFERIOR EN SUR ---
        JPanel panelSur = new JPanel(new GridLayout(2,1));
        panelSur.add(panelOpciones);
        panelSur.add(panelInferior);
        
        
        // --- JUNTAR TODOS LOS PANELES ---
        frame.add(panelSuperior,BorderLayout.NORTH);
        frame.add(areaTexto,BorderLayout.CENTER);
        frame.add(panelSur,BorderLayout.SOUTH);
        
        
        
        
        
        frame.setVisible(true);
    }
}
