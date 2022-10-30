/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaproyecto;

/**
 *
 * @author Frank Caicedo
 */

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Frank Caicedo
 */
public class Juego extends JPanel { //Esta clase va a heredar los atributos de JPanel
    LaberintoF laberinto = new LaberintoF();
    
    @Override //Esto indica que hereda de JPanel (metodo)
    public void paint(Graphics grafico){//Esto nos permite dibujar en el JPanel
        if (interfaz_inicial.global == 5) {
            laberinto.paint5x5(grafico);
        }
        else if(interfaz_inicial.global == 6){
            laberinto.paint6x6(grafico);
        }
        else if(interfaz_inicial.global == 7){
            laberinto.paint7x7(grafico);
        }
        else if(interfaz_inicial.global == 8){
            laberinto.paint8x8(grafico);
        }
        else if(interfaz_inicial.global == 9){
            laberinto.paint9x9(grafico);
        }
        else{
            laberinto.paint10x10(grafico);
            
        }
        
    }
    
    
    
    
    //Esta es la ventana 
    public static void main(String[] args){
        JFrame miventana = new JFrame("Laberinto");
        Juego game = new Juego();
        miventana.add(game);
        miventana.setSize(400,400); //Tamanio de la ventana
        miventana.setVisible(true);
        miventana.setLocationRelativeTo(null);
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
