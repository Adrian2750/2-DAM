/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_app;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author PC111
 */
public class DialogCarpeta extends JDialog {
    public DialogCarpeta(String nombre, String ruta, String texto){
        setTitle(nombre);
        
        setLayout(new java.awt.GridLayout(2,1));
        
        
        JLabel rutaLabel = new JLabel(ruta);
        JLabel textoLabel = new JLabel(texto);
        add(rutaLabel);
        add(textoLabel);
        
        setSize(500, 150);
        setModal(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
