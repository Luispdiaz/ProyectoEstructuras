/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaproyecto;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Frank Caicedo
 */
    
    // Se establecen las dimensiones del Laberinto
    public class LaberintoF {
    private int fila = 0; //Aqui indico las dimensiones dle laberinto
    private int columna = 0;
    private final int numeroFilas = interfaz_inicial.global;
    private final int numeroColumnas = interfaz_inicial.global ;
    private final int altoBloque = 40;
    private final int anchoBloque = 40;
    
    

     
    // Metodo para colorear los cuadros del laberinto 5x5
    public void paint5x5(Graphics grafico) {
        int[][] laberinto = obtieneLaberinto5x5();
        
        //Este primer for trabaja las filas y el anidado las columnas
        for (fila = 0; fila < numeroFilas; fila++) {
            for (columna = 0; columna < numeroColumnas; columna++) {
                if(laberinto[fila][columna] == 2){
                    grafico.setColor(Color.blue);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque); 
                }
                else if (laberinto[fila][columna] == 3) {
                grafico.setColor(Color.green);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
                else if (laberinto[fila][columna] == 4) {
                grafico.setColor(Color.red);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
            }
        }
    }
    
    // Metodo para colorear los cuadros del laberinto 6x6
    public void paint6x6(Graphics grafico) {
        int[][] laberinto = obtieneLaberinto6x6();
        
        //Este primer for trabaja las filas y el anidado las columnas
        for (fila = 0; fila < numeroFilas; fila++) {
            for (columna = 0; columna < numeroColumnas; columna++) {
                if(laberinto[fila][columna] == 2){
                    grafico.setColor(Color.blue);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque); 
                }
                else if (laberinto[fila][columna] == 3) {
                grafico.setColor(Color.green);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
                else if (laberinto[fila][columna] == 4) {
                grafico.setColor(Color.red);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
            }
        }
    }
    
    // Metodo para colorear los cuadros del laberinto 7x7
    public void paint7x7(Graphics grafico) {
        int[][] laberinto = obtieneLaberinto7x7();
        //Este primer for trabaja las filas y el anidado las columnas
        for (fila = 0; fila < numeroFilas; fila++) {
            for (columna = 0; columna < numeroColumnas; columna++) {
                if(laberinto[fila][columna] == 2){
                    grafico.setColor(Color.blue);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque); 
                }
                else if (laberinto[fila][columna] == 3) {
                grafico.setColor(Color.green);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
                else if (laberinto[fila][columna] == 4) {
                grafico.setColor(Color.red);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
            }
        }
    }
    
    // Metodo para colorear los cuadros del laberinto 8x8
    public void paint8x8(Graphics grafico) {
        int[][] laberinto = obtieneLaberinto8x8();
        //Este primer for trabaja las filas y el anidado las columnas
        for (fila = 0; fila < numeroFilas; fila++) {
            for (columna = 0; columna < numeroColumnas; columna++) {
                if(laberinto[fila][columna] == 2){
                    grafico.setColor(Color.blue);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque); 
                }
                else if (laberinto[fila][columna] == 3) {
                grafico.setColor(Color.green);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
                else if (laberinto[fila][columna] == 4) {
                grafico.setColor(Color.red);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
            }
        }
    }
    
    // Metodo para colorear los cuadros del laberinto 9x9
    public void paint9x9(Graphics grafico) {
        int[][] laberinto = obtieneLaberinto9x9();
        //Este primer for trabaja las filas y el anidado las columnas
        for (fila = 0; fila < numeroFilas; fila++) {
            for (columna = 0; columna < numeroColumnas; columna++) {
                if(laberinto[fila][columna] == 2){
                    grafico.setColor(Color.blue);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque); 
                }
                else if (laberinto[fila][columna] == 3) {
                grafico.setColor(Color.green);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
                else if (laberinto[fila][columna] == 4) {
                grafico.setColor(Color.red);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
            }
        }
        
    }
    
    // Metodo para colorear los cuadros del laberinto 10x10
    public void paint10x10(Graphics grafico) {
        int[][] laberinto = obtieneLaberinto10x10();
        //Este primer for trabaja las filas y el anidado las columnas
        for (fila = 0; fila < numeroFilas; fila++) {
            for (columna = 0; columna < numeroColumnas; columna++) {
                if(laberinto[fila][columna] == 2){
                    grafico.setColor(Color.blue);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque); 
                }
                else if (laberinto[fila][columna] == 3) {
                grafico.setColor(Color.green);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
                else if (laberinto[fila][columna] == 4) {
                grafico.setColor(Color.red);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
            }
        }
    }
       
    public void DFS(Graphics grafico){
        int entradafila = 0;
        int entradacolumna = 0;
        int[][] laberinto = obtieneLaberinto5x5();
    for (fila = 0; fila < numeroFilas; fila++) {
            for (columna = 0; columna < numeroColumnas; columna++) {
                if(laberinto[fila][columna] == 3){
                    entradafila = fila;
                    entradacolumna = columna;
                }}
    }
    if (entradafila == 0 && entradacolumna == 0){
    while(true){
    if(laberinto[entradafila][entradacolumna]==4){
        break;
    }
    else if(entradafila+1==5){
    entradafila = 4;
    entradacolumna += 1;
    grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
    } 
    else if(entradacolumna+1==5){
    entradacolumna = 4;
    entradafila += 1;
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
    }
    else if(laberinto[entradafila+1][entradacolumna]==1){
        entradafila += 1;
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
        
    }
    else if (laberinto[entradafila+1][entradacolumna]==2){
        entradacolumna += 1;
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
            }
    }
    }
    else if(entradafila == 0 && entradacolumna == 4){
    while(true){
    if(laberinto[entradafila][entradacolumna]==4){
        break;
    }
    else if(laberinto[entradafila+1][entradacolumna]==1){
        entradafila += 1;
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
        
    }
    else if (laberinto[entradafila+1][entradacolumna]==2){
        entradacolumna -= 1;
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
        
            }
    }
    }
    else if(entradafila == 4 && entradacolumna == 0){
    while(true){
    if(laberinto[entradafila][entradacolumna]==4){
        break;
    }
    else if(laberinto[entradafila+1][entradacolumna]==1){
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
        entradafila += 1;
    }
    else if (laberinto[entradafila+1][entradacolumna]==2){
        entradacolumna += 1;
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
            }
    }   
    
    }
    else if(entradafila == 4 & entradafila == 4){
    while(true){
    if(laberinto[entradafila][entradacolumna]==4){
        break;
    }
    else if(laberinto[entradafila+1][entradacolumna]==1){
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
        entradafila += 1;
    }
    else if (laberinto[entradafila+1][entradacolumna]==2){
        entradacolumna += 1;
        grafico.setColor(Color.yellow);
        grafico.fillRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque); //El 40 es para agrandar la forma
        grafico.setColor(Color.black);
        grafico.drawRect(entradacolumna*40, entradafila*40, anchoBloque, altoBloque);
            }
    } 
    }
    }   

    //Metodo para obtener el laberinto
    // Se toman los Estados de los vertices adyacentes para imprimirlos.
    public int[][] obtieneLaberinto5x5() {
        if (lista.vOrigen.getNumVertice() == 1){
        int laberinto[][] =
        {       {3, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),},
                {interfaz_inicial.listagrande.buscar(6).getEstado(), interfaz_inicial.listagrande.buscar(7).getEstado(), interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(),},
                {interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(),},
                {interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(),},
                {interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), 4,},};
        return laberinto;
    }
        else if (lista.vOrigen.getNumVertice() == 5){
            int laberinto[][] =
        {       {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), 3,},
                {interfaz_inicial.listagrande.buscar(6).getEstado(), interfaz_inicial.listagrande.buscar(7).getEstado(), interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(),},
                {interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(),},
                {interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(),},
                {4, interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(),},};
        return laberinto;
        }  
        else if (lista.vOrigen.getNumVertice() == 21){
            int laberinto[][] =
        {       {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), 4,},
                {interfaz_inicial.listagrande.buscar(6).getEstado(), interfaz_inicial.listagrande.buscar(7).getEstado(), interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(),},
                {interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(),},
                {interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(),},
                {3, interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(),},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 25){
        int laberinto[][] =
                //Los 2 son muros y los 1 no son muros
        {       {4, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),},
                {interfaz_inicial.listagrande.buscar(6).getEstado(), interfaz_inicial.listagrande.buscar(7).getEstado(), interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(),},
                {interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(),},
                {interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(),},
                {interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), 3,},};
        return laberinto;
    }
        return null;
    }
    public int[][] obtieneLaberinto6x6() {
        if (lista.vOrigen.getNumVertice() == 1){
        int laberinto[][] =
        {       {3, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(),interfaz_inicial.listagrande.buscar(5).getEstado(), interfaz_inicial.listagrande.buscar(6).getEstado(),},
                {interfaz_inicial.listagrande.buscar(7).getEstado(), interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(1).getEstado(),interfaz_inicial.listagrande.buscar(12).getEstado(),},
                {interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(), interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),},
                {interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),},
                {interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(), interfaz_inicial.listagrande.buscar(27).getEstado(), interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado(),},
                {interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(),4,},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 36){
        int laberinto[][] =
        {       {4, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(),interfaz_inicial.listagrande.buscar(5).getEstado(), interfaz_inicial.listagrande.buscar(6).getEstado(),},
                {interfaz_inicial.listagrande.buscar(7).getEstado(), interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(1).getEstado(),interfaz_inicial.listagrande.buscar(12).getEstado(),},
                {interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(), interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),},
                {interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),},
                {interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(), interfaz_inicial.listagrande.buscar(27).getEstado(), interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado(),},
                {interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(),3,},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 6){
        int laberinto[][] =
        {       {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(),interfaz_inicial.listagrande.buscar(5).getEstado(), 3,},
                {interfaz_inicial.listagrande.buscar(7).getEstado(), interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(1).getEstado(),interfaz_inicial.listagrande.buscar(12).getEstado(),},
                {interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(), interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),},
                {interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),},
                {interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(), interfaz_inicial.listagrande.buscar(27).getEstado(), interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado(),},
                {4, interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 31){
        int laberinto[][] =
        {       {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(),interfaz_inicial.listagrande.buscar(5).getEstado(), 4,},
                {interfaz_inicial.listagrande.buscar(7).getEstado(), interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(1).getEstado(),interfaz_inicial.listagrande.buscar(12).getEstado(),},
                {interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(), interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),},
                {interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),},
                {interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(), interfaz_inicial.listagrande.buscar(27).getEstado(), interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado(),},
                {3, interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),},};
        return laberinto;
        }
        return null;
    }
    public int[][] obtieneLaberinto7x7() {
        if (lista.vOrigen.getNumVertice() == 1){
        int laberinto[][] =
        {        {3, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(),interfaz_inicial.listagrande.buscar(5).getEstado(), interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado()},
                {interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(),interfaz_inicial.listagrande.buscar(13).getEstado(),interfaz_inicial.listagrande.buscar(14).getEstado()},
                {interfaz_inicial.listagrande.buscar(15).getEstado(), interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(),interfaz_inicial.listagrande.buscar(20).getEstado(),interfaz_inicial.listagrande.buscar(21).getEstado()},
                {interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),interfaz_inicial.listagrande.buscar(28).getEstado()},
                {interfaz_inicial.listagrande.buscar(29).getEstado(), interfaz_inicial.listagrande.buscar(30).getEstado(), interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(),interfaz_inicial.listagrande.buscar(34).getEstado(),interfaz_inicial.listagrande.buscar(35).getEstado()},
                {interfaz_inicial.listagrande.buscar(36).getEstado(), interfaz_inicial.listagrande.buscar(37).getEstado(), interfaz_inicial.listagrande.buscar(38).getEstado(), interfaz_inicial.listagrande.buscar(39).getEstado(), interfaz_inicial.listagrande.buscar(40).getEstado(),interfaz_inicial.listagrande.buscar(41).getEstado(),interfaz_inicial.listagrande.buscar(42).getEstado()},
                {interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(), interfaz_inicial.listagrande.buscar(46).getEstado(), interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),4},};

        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 49){
            int laberinto[][] =
        {        {4, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(),interfaz_inicial.listagrande.buscar(5).getEstado(), interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado()},
                {interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(),interfaz_inicial.listagrande.buscar(13).getEstado(),interfaz_inicial.listagrande.buscar(14).getEstado()},
                {interfaz_inicial.listagrande.buscar(15).getEstado(), interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(),interfaz_inicial.listagrande.buscar(20).getEstado(),interfaz_inicial.listagrande.buscar(21).getEstado()},
                {interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),interfaz_inicial.listagrande.buscar(28).getEstado()},
                {interfaz_inicial.listagrande.buscar(29).getEstado(), interfaz_inicial.listagrande.buscar(30).getEstado(), interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(),interfaz_inicial.listagrande.buscar(34).getEstado(),interfaz_inicial.listagrande.buscar(35).getEstado()},
                {interfaz_inicial.listagrande.buscar(36).getEstado(), interfaz_inicial.listagrande.buscar(37).getEstado(), interfaz_inicial.listagrande.buscar(38).getEstado(), interfaz_inicial.listagrande.buscar(39).getEstado(), interfaz_inicial.listagrande.buscar(40).getEstado(),interfaz_inicial.listagrande.buscar(41).getEstado(),interfaz_inicial.listagrande.buscar(42).getEstado()},
                {interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(), interfaz_inicial.listagrande.buscar(46).getEstado(), interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),3},};

        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 7){
            int laberinto[][] =
        {        {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(),interfaz_inicial.listagrande.buscar(5).getEstado(), interfaz_inicial.listagrande.buscar(6).getEstado(),3},
                {interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(),interfaz_inicial.listagrande.buscar(13).getEstado(),interfaz_inicial.listagrande.buscar(14).getEstado()},
                {interfaz_inicial.listagrande.buscar(15).getEstado(), interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(),interfaz_inicial.listagrande.buscar(20).getEstado(),interfaz_inicial.listagrande.buscar(21).getEstado()},
                {interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),interfaz_inicial.listagrande.buscar(28).getEstado()},
                {interfaz_inicial.listagrande.buscar(29).getEstado(), interfaz_inicial.listagrande.buscar(30).getEstado(), interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(),interfaz_inicial.listagrande.buscar(34).getEstado(),interfaz_inicial.listagrande.buscar(35).getEstado()},
                {interfaz_inicial.listagrande.buscar(36).getEstado(), interfaz_inicial.listagrande.buscar(37).getEstado(), interfaz_inicial.listagrande.buscar(38).getEstado(), interfaz_inicial.listagrande.buscar(39).getEstado(), interfaz_inicial.listagrande.buscar(40).getEstado(),interfaz_inicial.listagrande.buscar(41).getEstado(),interfaz_inicial.listagrande.buscar(42).getEstado()},
                {4, interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(), interfaz_inicial.listagrande.buscar(46).getEstado(), interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),interfaz_inicial.listagrande.buscar(49).getEstado()},};

        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 43){
            int laberinto[][] =
        {        {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(),interfaz_inicial.listagrande.buscar(5).getEstado(), interfaz_inicial.listagrande.buscar(6).getEstado(),4},
                {interfaz_inicial.listagrande.buscar(8).getEstado(), interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(),interfaz_inicial.listagrande.buscar(13).getEstado(),interfaz_inicial.listagrande.buscar(14).getEstado()},
                {interfaz_inicial.listagrande.buscar(15).getEstado(), interfaz_inicial.listagrande.buscar(16).getEstado(), interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(),interfaz_inicial.listagrande.buscar(20).getEstado(),interfaz_inicial.listagrande.buscar(21).getEstado()},
                {interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),interfaz_inicial.listagrande.buscar(28).getEstado()},
                {interfaz_inicial.listagrande.buscar(29).getEstado(), interfaz_inicial.listagrande.buscar(30).getEstado(), interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(),interfaz_inicial.listagrande.buscar(34).getEstado(),interfaz_inicial.listagrande.buscar(35).getEstado()},
                {interfaz_inicial.listagrande.buscar(36).getEstado(), interfaz_inicial.listagrande.buscar(37).getEstado(), interfaz_inicial.listagrande.buscar(38).getEstado(), interfaz_inicial.listagrande.buscar(39).getEstado(), interfaz_inicial.listagrande.buscar(40).getEstado(),interfaz_inicial.listagrande.buscar(41).getEstado(),interfaz_inicial.listagrande.buscar(42).getEstado()},
                {3, interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(), interfaz_inicial.listagrande.buscar(46).getEstado(), interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),interfaz_inicial.listagrande.buscar(49).getEstado()},};

        return laberinto;
        }
        return null;
    }
    public int[][] obtieneLaberinto8x8() {
        if (lista.vOrigen.getNumVertice() == 1){
        int laberinto[][] =
        {         {3, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),},
                {interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(),interfaz_inicial.listagrande.buscar(14).getEstado(),interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),},
                {interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(),interfaz_inicial.listagrande.buscar(22).getEstado(),interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),},
                {interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(), interfaz_inicial.listagrande.buscar(27).getEstado(), interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado(),interfaz_inicial.listagrande.buscar(31).getEstado(),interfaz_inicial.listagrande.buscar(32).getEstado(),},
                {interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(), interfaz_inicial.listagrande.buscar(36).getEstado(), interfaz_inicial.listagrande.buscar(37).getEstado(),interfaz_inicial.listagrande.buscar(38).getEstado(),interfaz_inicial.listagrande.buscar(39).getEstado(),interfaz_inicial.listagrande.buscar(40).getEstado(),},
                {interfaz_inicial.listagrande.buscar(41).getEstado(), interfaz_inicial.listagrande.buscar(42).getEstado(), interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(),interfaz_inicial.listagrande.buscar(46).getEstado(),interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),},
                {interfaz_inicial.listagrande.buscar(49).getEstado(), interfaz_inicial.listagrande.buscar(50).getEstado(), interfaz_inicial.listagrande.buscar(51).getEstado(), interfaz_inicial.listagrande.buscar(52).getEstado(), interfaz_inicial.listagrande.buscar(53).getEstado(),interfaz_inicial.listagrande.buscar(54).getEstado(),interfaz_inicial.listagrande.buscar(55).getEstado(),interfaz_inicial.listagrande.buscar(56).getEstado(),},
                {interfaz_inicial.listagrande.buscar(57).getEstado(), interfaz_inicial.listagrande.buscar(58).getEstado(), interfaz_inicial.listagrande.buscar(59).getEstado(), interfaz_inicial.listagrande.buscar(60).getEstado(), interfaz_inicial.listagrande.buscar(61).getEstado(),interfaz_inicial.listagrande.buscar(62).getEstado(),interfaz_inicial.listagrande.buscar(63).getEstado(),4,},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 64){
        int laberinto[][] =
        {         {4, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),},
                {interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(),interfaz_inicial.listagrande.buscar(14).getEstado(),interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),},
                {interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(),interfaz_inicial.listagrande.buscar(22).getEstado(),interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),},
                {interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(), interfaz_inicial.listagrande.buscar(27).getEstado(), interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado(),interfaz_inicial.listagrande.buscar(31).getEstado(),interfaz_inicial.listagrande.buscar(32).getEstado(),},
                {interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(), interfaz_inicial.listagrande.buscar(36).getEstado(), interfaz_inicial.listagrande.buscar(37).getEstado(),interfaz_inicial.listagrande.buscar(38).getEstado(),interfaz_inicial.listagrande.buscar(39).getEstado(),interfaz_inicial.listagrande.buscar(40).getEstado(),},
                {interfaz_inicial.listagrande.buscar(41).getEstado(), interfaz_inicial.listagrande.buscar(42).getEstado(), interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(),interfaz_inicial.listagrande.buscar(46).getEstado(),interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),},
                {interfaz_inicial.listagrande.buscar(49).getEstado(), interfaz_inicial.listagrande.buscar(50).getEstado(), interfaz_inicial.listagrande.buscar(51).getEstado(), interfaz_inicial.listagrande.buscar(52).getEstado(), interfaz_inicial.listagrande.buscar(53).getEstado(),interfaz_inicial.listagrande.buscar(54).getEstado(),interfaz_inicial.listagrande.buscar(55).getEstado(),interfaz_inicial.listagrande.buscar(56).getEstado(),},
                {interfaz_inicial.listagrande.buscar(57).getEstado(), interfaz_inicial.listagrande.buscar(58).getEstado(), interfaz_inicial.listagrande.buscar(59).getEstado(), interfaz_inicial.listagrande.buscar(60).getEstado(), interfaz_inicial.listagrande.buscar(61).getEstado(),interfaz_inicial.listagrande.buscar(62).getEstado(),interfaz_inicial.listagrande.buscar(63).getEstado(),3,},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 8){
        int laberinto[][] =
        {         {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),3,},
                {interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(),interfaz_inicial.listagrande.buscar(14).getEstado(),interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),},
                {interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(),interfaz_inicial.listagrande.buscar(22).getEstado(),interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),},
                {interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(), interfaz_inicial.listagrande.buscar(27).getEstado(), interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado(),interfaz_inicial.listagrande.buscar(31).getEstado(),interfaz_inicial.listagrande.buscar(32).getEstado(),},
                {interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(), interfaz_inicial.listagrande.buscar(36).getEstado(), interfaz_inicial.listagrande.buscar(37).getEstado(),interfaz_inicial.listagrande.buscar(38).getEstado(),interfaz_inicial.listagrande.buscar(39).getEstado(),interfaz_inicial.listagrande.buscar(40).getEstado(),},
                {interfaz_inicial.listagrande.buscar(41).getEstado(), interfaz_inicial.listagrande.buscar(42).getEstado(), interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(),interfaz_inicial.listagrande.buscar(46).getEstado(),interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),},
                {interfaz_inicial.listagrande.buscar(49).getEstado(), interfaz_inicial.listagrande.buscar(50).getEstado(), interfaz_inicial.listagrande.buscar(51).getEstado(), interfaz_inicial.listagrande.buscar(52).getEstado(), interfaz_inicial.listagrande.buscar(53).getEstado(),interfaz_inicial.listagrande.buscar(54).getEstado(),interfaz_inicial.listagrande.buscar(55).getEstado(),interfaz_inicial.listagrande.buscar(56).getEstado(),},
                {4, interfaz_inicial.listagrande.buscar(58).getEstado(), interfaz_inicial.listagrande.buscar(59).getEstado(), interfaz_inicial.listagrande.buscar(60).getEstado(), interfaz_inicial.listagrande.buscar(61).getEstado(),interfaz_inicial.listagrande.buscar(62).getEstado(),interfaz_inicial.listagrande.buscar(63).getEstado(),interfaz_inicial.listagrande.buscar(64).getEstado(),},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 57){
        int laberinto[][] =
                //Los 1 son muros y los 0 no son muros
        {         {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),4,},
                {interfaz_inicial.listagrande.buscar(9).getEstado(), interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(),interfaz_inicial.listagrande.buscar(14).getEstado(),interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),},
                {interfaz_inicial.listagrande.buscar(17).getEstado(), interfaz_inicial.listagrande.buscar(18).getEstado(), interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(),interfaz_inicial.listagrande.buscar(22).getEstado(),interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),},
                {interfaz_inicial.listagrande.buscar(25).getEstado(), interfaz_inicial.listagrande.buscar(26).getEstado(), interfaz_inicial.listagrande.buscar(27).getEstado(), interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado(),interfaz_inicial.listagrande.buscar(31).getEstado(),interfaz_inicial.listagrande.buscar(32).getEstado(),},
                {interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(), interfaz_inicial.listagrande.buscar(36).getEstado(), interfaz_inicial.listagrande.buscar(37).getEstado(),interfaz_inicial.listagrande.buscar(38).getEstado(),interfaz_inicial.listagrande.buscar(39).getEstado(),interfaz_inicial.listagrande.buscar(40).getEstado(),},
                {interfaz_inicial.listagrande.buscar(41).getEstado(), interfaz_inicial.listagrande.buscar(42).getEstado(), interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(),interfaz_inicial.listagrande.buscar(46).getEstado(),interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),},
                {interfaz_inicial.listagrande.buscar(49).getEstado(), interfaz_inicial.listagrande.buscar(50).getEstado(), interfaz_inicial.listagrande.buscar(51).getEstado(), interfaz_inicial.listagrande.buscar(52).getEstado(), interfaz_inicial.listagrande.buscar(53).getEstado(),interfaz_inicial.listagrande.buscar(54).getEstado(),interfaz_inicial.listagrande.buscar(55).getEstado(),interfaz_inicial.listagrande.buscar(56).getEstado(),},
                {3, interfaz_inicial.listagrande.buscar(58).getEstado(), interfaz_inicial.listagrande.buscar(59).getEstado(), interfaz_inicial.listagrande.buscar(60).getEstado(), interfaz_inicial.listagrande.buscar(61).getEstado(),interfaz_inicial.listagrande.buscar(62).getEstado(),interfaz_inicial.listagrande.buscar(63).getEstado(),interfaz_inicial.listagrande.buscar(64).getEstado(),},};
        return laberinto;
        }
        return null;
    }
    public int[][] obtieneLaberinto9x9() {
        if (lista.vOrigen.getNumVertice() == 1){
        int laberinto[][] =
        {       {3, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),interfaz_inicial.listagrande.buscar(9).getEstado(),},
                {interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(),interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),},
                {interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),interfaz_inicial.listagrande.buscar(25).getEstado(),interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),},
                {interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(), interfaz_inicial.listagrande.buscar(30).getEstado(), interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(),interfaz_inicial.listagrande.buscar(33).getEstado(),interfaz_inicial.listagrande.buscar(34).getEstado(),interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),},
                {interfaz_inicial.listagrande.buscar(37).getEstado(), interfaz_inicial.listagrande.buscar(38).getEstado(), interfaz_inicial.listagrande.buscar(39).getEstado(), interfaz_inicial.listagrande.buscar(40).getEstado(), interfaz_inicial.listagrande.buscar(41).getEstado(),interfaz_inicial.listagrande.buscar(42).getEstado(),interfaz_inicial.listagrande.buscar(43).getEstado(),interfaz_inicial.listagrande.buscar(44).getEstado(),interfaz_inicial.listagrande.buscar(45).getEstado(),},
                {interfaz_inicial.listagrande.buscar(46).getEstado(), interfaz_inicial.listagrande.buscar(47).getEstado(), interfaz_inicial.listagrande.buscar(48).getEstado(), interfaz_inicial.listagrande.buscar(49).getEstado(), interfaz_inicial.listagrande.buscar(50).getEstado(),interfaz_inicial.listagrande.buscar(51).getEstado(),interfaz_inicial.listagrande.buscar(52).getEstado(),interfaz_inicial.listagrande.buscar(53).getEstado(),interfaz_inicial.listagrande.buscar(54).getEstado(),},
                {interfaz_inicial.listagrande.buscar(55).getEstado(), interfaz_inicial.listagrande.buscar(56).getEstado(), interfaz_inicial.listagrande.buscar(57).getEstado(), interfaz_inicial.listagrande.buscar(58).getEstado(), interfaz_inicial.listagrande.buscar(59).getEstado(),interfaz_inicial.listagrande.buscar(60).getEstado(),interfaz_inicial.listagrande.buscar(61).getEstado(),interfaz_inicial.listagrande.buscar(62).getEstado(),interfaz_inicial.listagrande.buscar(63).getEstado(),},
                {interfaz_inicial.listagrande.buscar(64).getEstado(), interfaz_inicial.listagrande.buscar(65).getEstado(), interfaz_inicial.listagrande.buscar(66).getEstado(), interfaz_inicial.listagrande.buscar(67).getEstado(), interfaz_inicial.listagrande.buscar(68).getEstado(),interfaz_inicial.listagrande.buscar(69).getEstado(),interfaz_inicial.listagrande.buscar(70).getEstado(),interfaz_inicial.listagrande.buscar(71).getEstado(),interfaz_inicial.listagrande.buscar(72).getEstado(),},
                {interfaz_inicial.listagrande.buscar(73).getEstado(), interfaz_inicial.listagrande.buscar(74).getEstado(), interfaz_inicial.listagrande.buscar(75).getEstado(), interfaz_inicial.listagrande.buscar(76).getEstado(), interfaz_inicial.listagrande.buscar(77).getEstado(),interfaz_inicial.listagrande.buscar(78).getEstado(),interfaz_inicial.listagrande.buscar(79).getEstado(),interfaz_inicial.listagrande.buscar(80).getEstado(),4,},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 81){
        int laberinto[][] =
        {       {4, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),interfaz_inicial.listagrande.buscar(9).getEstado(),},
                {interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(),interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),},
                {interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),interfaz_inicial.listagrande.buscar(25).getEstado(),interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),},
                {interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(), interfaz_inicial.listagrande.buscar(30).getEstado(), interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(),interfaz_inicial.listagrande.buscar(33).getEstado(),interfaz_inicial.listagrande.buscar(34).getEstado(),interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),},
                {interfaz_inicial.listagrande.buscar(37).getEstado(), interfaz_inicial.listagrande.buscar(38).getEstado(), interfaz_inicial.listagrande.buscar(39).getEstado(), interfaz_inicial.listagrande.buscar(40).getEstado(), interfaz_inicial.listagrande.buscar(41).getEstado(),interfaz_inicial.listagrande.buscar(42).getEstado(),interfaz_inicial.listagrande.buscar(43).getEstado(),interfaz_inicial.listagrande.buscar(44).getEstado(),interfaz_inicial.listagrande.buscar(45).getEstado(),},
                {interfaz_inicial.listagrande.buscar(46).getEstado(), interfaz_inicial.listagrande.buscar(47).getEstado(), interfaz_inicial.listagrande.buscar(48).getEstado(), interfaz_inicial.listagrande.buscar(49).getEstado(), interfaz_inicial.listagrande.buscar(50).getEstado(),interfaz_inicial.listagrande.buscar(51).getEstado(),interfaz_inicial.listagrande.buscar(52).getEstado(),interfaz_inicial.listagrande.buscar(53).getEstado(),interfaz_inicial.listagrande.buscar(54).getEstado(),},
                {interfaz_inicial.listagrande.buscar(55).getEstado(), interfaz_inicial.listagrande.buscar(56).getEstado(), interfaz_inicial.listagrande.buscar(57).getEstado(), interfaz_inicial.listagrande.buscar(58).getEstado(), interfaz_inicial.listagrande.buscar(59).getEstado(),interfaz_inicial.listagrande.buscar(60).getEstado(),interfaz_inicial.listagrande.buscar(61).getEstado(),interfaz_inicial.listagrande.buscar(62).getEstado(),interfaz_inicial.listagrande.buscar(63).getEstado(),},
                {interfaz_inicial.listagrande.buscar(64).getEstado(), interfaz_inicial.listagrande.buscar(65).getEstado(), interfaz_inicial.listagrande.buscar(66).getEstado(), interfaz_inicial.listagrande.buscar(67).getEstado(), interfaz_inicial.listagrande.buscar(68).getEstado(),interfaz_inicial.listagrande.buscar(69).getEstado(),interfaz_inicial.listagrande.buscar(70).getEstado(),interfaz_inicial.listagrande.buscar(71).getEstado(),interfaz_inicial.listagrande.buscar(72).getEstado(),},
                {interfaz_inicial.listagrande.buscar(73).getEstado(), interfaz_inicial.listagrande.buscar(74).getEstado(), interfaz_inicial.listagrande.buscar(75).getEstado(), interfaz_inicial.listagrande.buscar(76).getEstado(), interfaz_inicial.listagrande.buscar(77).getEstado(),interfaz_inicial.listagrande.buscar(78).getEstado(),interfaz_inicial.listagrande.buscar(79).getEstado(),interfaz_inicial.listagrande.buscar(80).getEstado(),3,},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 9){
        int laberinto[][] =
        {       {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),3,},
                {interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(),interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),},
                {interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),interfaz_inicial.listagrande.buscar(25).getEstado(),interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),},
                {interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(), interfaz_inicial.listagrande.buscar(30).getEstado(), interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(),interfaz_inicial.listagrande.buscar(33).getEstado(),interfaz_inicial.listagrande.buscar(34).getEstado(),interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),},
                {interfaz_inicial.listagrande.buscar(37).getEstado(), interfaz_inicial.listagrande.buscar(38).getEstado(), interfaz_inicial.listagrande.buscar(39).getEstado(), interfaz_inicial.listagrande.buscar(40).getEstado(), interfaz_inicial.listagrande.buscar(41).getEstado(),interfaz_inicial.listagrande.buscar(42).getEstado(),interfaz_inicial.listagrande.buscar(43).getEstado(),interfaz_inicial.listagrande.buscar(44).getEstado(),interfaz_inicial.listagrande.buscar(45).getEstado(),},
                {interfaz_inicial.listagrande.buscar(46).getEstado(), interfaz_inicial.listagrande.buscar(47).getEstado(), interfaz_inicial.listagrande.buscar(48).getEstado(), interfaz_inicial.listagrande.buscar(49).getEstado(), interfaz_inicial.listagrande.buscar(50).getEstado(),interfaz_inicial.listagrande.buscar(51).getEstado(),interfaz_inicial.listagrande.buscar(52).getEstado(),interfaz_inicial.listagrande.buscar(53).getEstado(),interfaz_inicial.listagrande.buscar(54).getEstado(),},
                {interfaz_inicial.listagrande.buscar(55).getEstado(), interfaz_inicial.listagrande.buscar(56).getEstado(), interfaz_inicial.listagrande.buscar(57).getEstado(), interfaz_inicial.listagrande.buscar(58).getEstado(), interfaz_inicial.listagrande.buscar(59).getEstado(),interfaz_inicial.listagrande.buscar(60).getEstado(),interfaz_inicial.listagrande.buscar(61).getEstado(),interfaz_inicial.listagrande.buscar(62).getEstado(),interfaz_inicial.listagrande.buscar(63).getEstado(),},
                {interfaz_inicial.listagrande.buscar(64).getEstado(), interfaz_inicial.listagrande.buscar(65).getEstado(), interfaz_inicial.listagrande.buscar(66).getEstado(), interfaz_inicial.listagrande.buscar(67).getEstado(), interfaz_inicial.listagrande.buscar(68).getEstado(),interfaz_inicial.listagrande.buscar(69).getEstado(),interfaz_inicial.listagrande.buscar(70).getEstado(),interfaz_inicial.listagrande.buscar(71).getEstado(),interfaz_inicial.listagrande.buscar(72).getEstado(),},
                {4, interfaz_inicial.listagrande.buscar(74).getEstado(), interfaz_inicial.listagrande.buscar(75).getEstado(), interfaz_inicial.listagrande.buscar(76).getEstado(), interfaz_inicial.listagrande.buscar(77).getEstado(),interfaz_inicial.listagrande.buscar(78).getEstado(),interfaz_inicial.listagrande.buscar(79).getEstado(),interfaz_inicial.listagrande.buscar(80).getEstado(),interfaz_inicial.listagrande.buscar(81).getEstado(),},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 73){
        int laberinto[][] =
        {       {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),4,},
                {interfaz_inicial.listagrande.buscar(10).getEstado(), interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(),interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),},
                {interfaz_inicial.listagrande.buscar(19).getEstado(), interfaz_inicial.listagrande.buscar(20).getEstado(), interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(),interfaz_inicial.listagrande.buscar(24).getEstado(),interfaz_inicial.listagrande.buscar(25).getEstado(),interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),},
                {interfaz_inicial.listagrande.buscar(28).getEstado(), interfaz_inicial.listagrande.buscar(29).getEstado(), interfaz_inicial.listagrande.buscar(30).getEstado(), interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(),interfaz_inicial.listagrande.buscar(33).getEstado(),interfaz_inicial.listagrande.buscar(34).getEstado(),interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),},
                {interfaz_inicial.listagrande.buscar(37).getEstado(), interfaz_inicial.listagrande.buscar(38).getEstado(), interfaz_inicial.listagrande.buscar(39).getEstado(), interfaz_inicial.listagrande.buscar(40).getEstado(), interfaz_inicial.listagrande.buscar(41).getEstado(),interfaz_inicial.listagrande.buscar(42).getEstado(),interfaz_inicial.listagrande.buscar(43).getEstado(),interfaz_inicial.listagrande.buscar(44).getEstado(),interfaz_inicial.listagrande.buscar(45).getEstado(),},
                {interfaz_inicial.listagrande.buscar(46).getEstado(), interfaz_inicial.listagrande.buscar(47).getEstado(), interfaz_inicial.listagrande.buscar(48).getEstado(), interfaz_inicial.listagrande.buscar(49).getEstado(), interfaz_inicial.listagrande.buscar(50).getEstado(),interfaz_inicial.listagrande.buscar(51).getEstado(),interfaz_inicial.listagrande.buscar(52).getEstado(),interfaz_inicial.listagrande.buscar(53).getEstado(),interfaz_inicial.listagrande.buscar(54).getEstado(),},
                {interfaz_inicial.listagrande.buscar(55).getEstado(), interfaz_inicial.listagrande.buscar(56).getEstado(), interfaz_inicial.listagrande.buscar(57).getEstado(), interfaz_inicial.listagrande.buscar(58).getEstado(), interfaz_inicial.listagrande.buscar(59).getEstado(),interfaz_inicial.listagrande.buscar(60).getEstado(),interfaz_inicial.listagrande.buscar(61).getEstado(),interfaz_inicial.listagrande.buscar(62).getEstado(),interfaz_inicial.listagrande.buscar(63).getEstado(),},
                {interfaz_inicial.listagrande.buscar(64).getEstado(), interfaz_inicial.listagrande.buscar(65).getEstado(), interfaz_inicial.listagrande.buscar(66).getEstado(), interfaz_inicial.listagrande.buscar(67).getEstado(), interfaz_inicial.listagrande.buscar(68).getEstado(),interfaz_inicial.listagrande.buscar(69).getEstado(),interfaz_inicial.listagrande.buscar(70).getEstado(),interfaz_inicial.listagrande.buscar(71).getEstado(),interfaz_inicial.listagrande.buscar(72).getEstado(),},
                {3, interfaz_inicial.listagrande.buscar(74).getEstado(), interfaz_inicial.listagrande.buscar(75).getEstado(), interfaz_inicial.listagrande.buscar(76).getEstado(), interfaz_inicial.listagrande.buscar(77).getEstado(),interfaz_inicial.listagrande.buscar(78).getEstado(),interfaz_inicial.listagrande.buscar(79).getEstado(),interfaz_inicial.listagrande.buscar(80).getEstado(),interfaz_inicial.listagrande.buscar(81).getEstado(),},};
        return laberinto;
        }
        return null;
    }
    public int[][] obtieneLaberinto10x10() {
        if (lista.vOrigen.getNumVertice() == 1){
        int laberinto[][] =
        {       {3, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),interfaz_inicial.listagrande.buscar(9).getEstado(),interfaz_inicial.listagrande.buscar(10).getEstado(),},
                {interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),interfaz_inicial.listagrande.buscar(19).getEstado(),interfaz_inicial.listagrande.buscar(20).getEstado()},
                {interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(),interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),interfaz_inicial.listagrande.buscar(28).getEstado(),interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado()},
                {interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),interfaz_inicial.listagrande.buscar(37).getEstado(),interfaz_inicial.listagrande.buscar(38).getEstado(),interfaz_inicial.listagrande.buscar(39).getEstado(),interfaz_inicial.listagrande.buscar(40).getEstado()},
                {interfaz_inicial.listagrande.buscar(41).getEstado(), interfaz_inicial.listagrande.buscar(42).getEstado(), interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(),interfaz_inicial.listagrande.buscar(46).getEstado(),interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),interfaz_inicial.listagrande.buscar(49).getEstado(),interfaz_inicial.listagrande.buscar(50).getEstado()},
                {interfaz_inicial.listagrande.buscar(51).getEstado(), interfaz_inicial.listagrande.buscar(52).getEstado(), interfaz_inicial.listagrande.buscar(53).getEstado(), interfaz_inicial.listagrande.buscar(54).getEstado(), interfaz_inicial.listagrande.buscar(55).getEstado(),interfaz_inicial.listagrande.buscar(56).getEstado(),interfaz_inicial.listagrande.buscar(57).getEstado(),interfaz_inicial.listagrande.buscar(58).getEstado(),interfaz_inicial.listagrande.buscar(59).getEstado(),interfaz_inicial.listagrande.buscar(60).getEstado()},
                {interfaz_inicial.listagrande.buscar(61).getEstado(), interfaz_inicial.listagrande.buscar(62).getEstado(), interfaz_inicial.listagrande.buscar(63).getEstado(), interfaz_inicial.listagrande.buscar(64).getEstado(), interfaz_inicial.listagrande.buscar(65).getEstado(),interfaz_inicial.listagrande.buscar(66).getEstado(),interfaz_inicial.listagrande.buscar(67).getEstado(),interfaz_inicial.listagrande.buscar(68).getEstado(),interfaz_inicial.listagrande.buscar(69).getEstado(),interfaz_inicial.listagrande.buscar(70).getEstado()},
                {interfaz_inicial.listagrande.buscar(71).getEstado(), interfaz_inicial.listagrande.buscar(72).getEstado(), interfaz_inicial.listagrande.buscar(73).getEstado(), interfaz_inicial.listagrande.buscar(74).getEstado(), interfaz_inicial.listagrande.buscar(75).getEstado(),interfaz_inicial.listagrande.buscar(76).getEstado(),interfaz_inicial.listagrande.buscar(77).getEstado(),interfaz_inicial.listagrande.buscar(78).getEstado(),interfaz_inicial.listagrande.buscar(79).getEstado(),interfaz_inicial.listagrande.buscar(80).getEstado()},
                {interfaz_inicial.listagrande.buscar(81).getEstado(), interfaz_inicial.listagrande.buscar(82).getEstado(), interfaz_inicial.listagrande.buscar(83).getEstado(), interfaz_inicial.listagrande.buscar(84).getEstado(), interfaz_inicial.listagrande.buscar(85).getEstado(),interfaz_inicial.listagrande.buscar(86).getEstado(),interfaz_inicial.listagrande.buscar(87).getEstado(),interfaz_inicial.listagrande.buscar(88).getEstado(),interfaz_inicial.listagrande.buscar(89).getEstado(),interfaz_inicial.listagrande.buscar(90).getEstado()},
                {interfaz_inicial.listagrande.buscar(91).getEstado(), interfaz_inicial.listagrande.buscar(92).getEstado(), interfaz_inicial.listagrande.buscar(93).getEstado(), interfaz_inicial.listagrande.buscar(94).getEstado(), interfaz_inicial.listagrande.buscar(95).getEstado(),interfaz_inicial.listagrande.buscar(96).getEstado(),interfaz_inicial.listagrande.buscar(97).getEstado(),interfaz_inicial.listagrande.buscar(98).getEstado(),interfaz_inicial.listagrande.buscar(99).getEstado(),4},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 100){
        int laberinto[][] =
        {       {4, interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),interfaz_inicial.listagrande.buscar(9).getEstado(),interfaz_inicial.listagrande.buscar(10).getEstado(),},
                {interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),interfaz_inicial.listagrande.buscar(19).getEstado(),interfaz_inicial.listagrande.buscar(20).getEstado()},
                {interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(),interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),interfaz_inicial.listagrande.buscar(28).getEstado(),interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado()},
                {interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),interfaz_inicial.listagrande.buscar(37).getEstado(),interfaz_inicial.listagrande.buscar(38).getEstado(),interfaz_inicial.listagrande.buscar(39).getEstado(),interfaz_inicial.listagrande.buscar(40).getEstado()},
                {interfaz_inicial.listagrande.buscar(41).getEstado(), interfaz_inicial.listagrande.buscar(42).getEstado(), interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(),interfaz_inicial.listagrande.buscar(46).getEstado(),interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),interfaz_inicial.listagrande.buscar(49).getEstado(),interfaz_inicial.listagrande.buscar(50).getEstado()},
                {interfaz_inicial.listagrande.buscar(51).getEstado(), interfaz_inicial.listagrande.buscar(52).getEstado(), interfaz_inicial.listagrande.buscar(53).getEstado(), interfaz_inicial.listagrande.buscar(54).getEstado(), interfaz_inicial.listagrande.buscar(55).getEstado(),interfaz_inicial.listagrande.buscar(56).getEstado(),interfaz_inicial.listagrande.buscar(57).getEstado(),interfaz_inicial.listagrande.buscar(58).getEstado(),interfaz_inicial.listagrande.buscar(59).getEstado(),interfaz_inicial.listagrande.buscar(60).getEstado()},
                {interfaz_inicial.listagrande.buscar(61).getEstado(), interfaz_inicial.listagrande.buscar(62).getEstado(), interfaz_inicial.listagrande.buscar(63).getEstado(), interfaz_inicial.listagrande.buscar(64).getEstado(), interfaz_inicial.listagrande.buscar(65).getEstado(),interfaz_inicial.listagrande.buscar(66).getEstado(),interfaz_inicial.listagrande.buscar(67).getEstado(),interfaz_inicial.listagrande.buscar(68).getEstado(),interfaz_inicial.listagrande.buscar(69).getEstado(),interfaz_inicial.listagrande.buscar(70).getEstado()},
                {interfaz_inicial.listagrande.buscar(71).getEstado(), interfaz_inicial.listagrande.buscar(72).getEstado(), interfaz_inicial.listagrande.buscar(73).getEstado(), interfaz_inicial.listagrande.buscar(74).getEstado(), interfaz_inicial.listagrande.buscar(75).getEstado(),interfaz_inicial.listagrande.buscar(76).getEstado(),interfaz_inicial.listagrande.buscar(77).getEstado(),interfaz_inicial.listagrande.buscar(78).getEstado(),interfaz_inicial.listagrande.buscar(79).getEstado(),interfaz_inicial.listagrande.buscar(80).getEstado()},
                {interfaz_inicial.listagrande.buscar(81).getEstado(), interfaz_inicial.listagrande.buscar(82).getEstado(), interfaz_inicial.listagrande.buscar(83).getEstado(), interfaz_inicial.listagrande.buscar(84).getEstado(), interfaz_inicial.listagrande.buscar(85).getEstado(),interfaz_inicial.listagrande.buscar(86).getEstado(),interfaz_inicial.listagrande.buscar(87).getEstado(),interfaz_inicial.listagrande.buscar(88).getEstado(),interfaz_inicial.listagrande.buscar(89).getEstado(),interfaz_inicial.listagrande.buscar(90).getEstado()},
                {interfaz_inicial.listagrande.buscar(91).getEstado(), interfaz_inicial.listagrande.buscar(92).getEstado(), interfaz_inicial.listagrande.buscar(93).getEstado(), interfaz_inicial.listagrande.buscar(94).getEstado(), interfaz_inicial.listagrande.buscar(95).getEstado(),interfaz_inicial.listagrande.buscar(96).getEstado(),interfaz_inicial.listagrande.buscar(97).getEstado(),interfaz_inicial.listagrande.buscar(98).getEstado(),interfaz_inicial.listagrande.buscar(99).getEstado(),3},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 10){
        int laberinto[][] =
        {       {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),interfaz_inicial.listagrande.buscar(9).getEstado(),3,},
                {interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),interfaz_inicial.listagrande.buscar(19).getEstado(),interfaz_inicial.listagrande.buscar(20).getEstado()},
                {interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(),interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),interfaz_inicial.listagrande.buscar(28).getEstado(),interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado()},
                {interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),interfaz_inicial.listagrande.buscar(37).getEstado(),interfaz_inicial.listagrande.buscar(38).getEstado(),interfaz_inicial.listagrande.buscar(39).getEstado(),interfaz_inicial.listagrande.buscar(40).getEstado()},
                {interfaz_inicial.listagrande.buscar(41).getEstado(), interfaz_inicial.listagrande.buscar(42).getEstado(), interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(),interfaz_inicial.listagrande.buscar(46).getEstado(),interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),interfaz_inicial.listagrande.buscar(49).getEstado(),interfaz_inicial.listagrande.buscar(50).getEstado()},
                {interfaz_inicial.listagrande.buscar(51).getEstado(), interfaz_inicial.listagrande.buscar(52).getEstado(), interfaz_inicial.listagrande.buscar(53).getEstado(), interfaz_inicial.listagrande.buscar(54).getEstado(), interfaz_inicial.listagrande.buscar(55).getEstado(),interfaz_inicial.listagrande.buscar(56).getEstado(),interfaz_inicial.listagrande.buscar(57).getEstado(),interfaz_inicial.listagrande.buscar(58).getEstado(),interfaz_inicial.listagrande.buscar(59).getEstado(),interfaz_inicial.listagrande.buscar(60).getEstado()},
                {interfaz_inicial.listagrande.buscar(61).getEstado(), interfaz_inicial.listagrande.buscar(62).getEstado(), interfaz_inicial.listagrande.buscar(63).getEstado(), interfaz_inicial.listagrande.buscar(64).getEstado(), interfaz_inicial.listagrande.buscar(65).getEstado(),interfaz_inicial.listagrande.buscar(66).getEstado(),interfaz_inicial.listagrande.buscar(67).getEstado(),interfaz_inicial.listagrande.buscar(68).getEstado(),interfaz_inicial.listagrande.buscar(69).getEstado(),interfaz_inicial.listagrande.buscar(70).getEstado()},
                {interfaz_inicial.listagrande.buscar(71).getEstado(), interfaz_inicial.listagrande.buscar(72).getEstado(), interfaz_inicial.listagrande.buscar(73).getEstado(), interfaz_inicial.listagrande.buscar(74).getEstado(), interfaz_inicial.listagrande.buscar(75).getEstado(),interfaz_inicial.listagrande.buscar(76).getEstado(),interfaz_inicial.listagrande.buscar(77).getEstado(),interfaz_inicial.listagrande.buscar(78).getEstado(),interfaz_inicial.listagrande.buscar(79).getEstado(),interfaz_inicial.listagrande.buscar(80).getEstado()},
                {interfaz_inicial.listagrande.buscar(81).getEstado(), interfaz_inicial.listagrande.buscar(82).getEstado(), interfaz_inicial.listagrande.buscar(83).getEstado(), interfaz_inicial.listagrande.buscar(84).getEstado(), interfaz_inicial.listagrande.buscar(85).getEstado(),interfaz_inicial.listagrande.buscar(86).getEstado(),interfaz_inicial.listagrande.buscar(87).getEstado(),interfaz_inicial.listagrande.buscar(88).getEstado(),interfaz_inicial.listagrande.buscar(89).getEstado(),interfaz_inicial.listagrande.buscar(90).getEstado()},
                {4, interfaz_inicial.listagrande.buscar(92).getEstado(), interfaz_inicial.listagrande.buscar(93).getEstado(), interfaz_inicial.listagrande.buscar(94).getEstado(), interfaz_inicial.listagrande.buscar(95).getEstado(),interfaz_inicial.listagrande.buscar(96).getEstado(),interfaz_inicial.listagrande.buscar(97).getEstado(),interfaz_inicial.listagrande.buscar(98).getEstado(),interfaz_inicial.listagrande.buscar(99).getEstado(),interfaz_inicial.listagrande.buscar(100).getEstado()},};
        return laberinto;
        }
        else if (lista.vOrigen.getNumVertice() == 91){
        int laberinto[][] =
        {       {interfaz_inicial.listagrande.buscar(1).getEstado(), interfaz_inicial.listagrande.buscar(2).getEstado(), interfaz_inicial.listagrande.buscar(3).getEstado(), interfaz_inicial.listagrande.buscar(4).getEstado(), interfaz_inicial.listagrande.buscar(5).getEstado(),interfaz_inicial.listagrande.buscar(6).getEstado(),interfaz_inicial.listagrande.buscar(7).getEstado(),interfaz_inicial.listagrande.buscar(8).getEstado(),interfaz_inicial.listagrande.buscar(9).getEstado(),4,},
                {interfaz_inicial.listagrande.buscar(11).getEstado(), interfaz_inicial.listagrande.buscar(12).getEstado(), interfaz_inicial.listagrande.buscar(13).getEstado(), interfaz_inicial.listagrande.buscar(14).getEstado(), interfaz_inicial.listagrande.buscar(15).getEstado(),interfaz_inicial.listagrande.buscar(16).getEstado(),interfaz_inicial.listagrande.buscar(17).getEstado(),interfaz_inicial.listagrande.buscar(18).getEstado(),interfaz_inicial.listagrande.buscar(19).getEstado(),interfaz_inicial.listagrande.buscar(20).getEstado()},
                {interfaz_inicial.listagrande.buscar(21).getEstado(), interfaz_inicial.listagrande.buscar(22).getEstado(), interfaz_inicial.listagrande.buscar(23).getEstado(), interfaz_inicial.listagrande.buscar(24).getEstado(), interfaz_inicial.listagrande.buscar(25).getEstado(),interfaz_inicial.listagrande.buscar(26).getEstado(),interfaz_inicial.listagrande.buscar(27).getEstado(),interfaz_inicial.listagrande.buscar(28).getEstado(),interfaz_inicial.listagrande.buscar(29).getEstado(),interfaz_inicial.listagrande.buscar(30).getEstado()},
                {interfaz_inicial.listagrande.buscar(31).getEstado(), interfaz_inicial.listagrande.buscar(32).getEstado(), interfaz_inicial.listagrande.buscar(33).getEstado(), interfaz_inicial.listagrande.buscar(34).getEstado(), interfaz_inicial.listagrande.buscar(35).getEstado(),interfaz_inicial.listagrande.buscar(36).getEstado(),interfaz_inicial.listagrande.buscar(37).getEstado(),interfaz_inicial.listagrande.buscar(38).getEstado(),interfaz_inicial.listagrande.buscar(39).getEstado(),interfaz_inicial.listagrande.buscar(40).getEstado()},
                {interfaz_inicial.listagrande.buscar(41).getEstado(), interfaz_inicial.listagrande.buscar(42).getEstado(), interfaz_inicial.listagrande.buscar(43).getEstado(), interfaz_inicial.listagrande.buscar(44).getEstado(), interfaz_inicial.listagrande.buscar(45).getEstado(),interfaz_inicial.listagrande.buscar(46).getEstado(),interfaz_inicial.listagrande.buscar(47).getEstado(),interfaz_inicial.listagrande.buscar(48).getEstado(),interfaz_inicial.listagrande.buscar(49).getEstado(),interfaz_inicial.listagrande.buscar(50).getEstado()},
                {interfaz_inicial.listagrande.buscar(51).getEstado(), interfaz_inicial.listagrande.buscar(52).getEstado(), interfaz_inicial.listagrande.buscar(53).getEstado(), interfaz_inicial.listagrande.buscar(54).getEstado(), interfaz_inicial.listagrande.buscar(55).getEstado(),interfaz_inicial.listagrande.buscar(56).getEstado(),interfaz_inicial.listagrande.buscar(57).getEstado(),interfaz_inicial.listagrande.buscar(58).getEstado(),interfaz_inicial.listagrande.buscar(59).getEstado(),interfaz_inicial.listagrande.buscar(60).getEstado()},
                {interfaz_inicial.listagrande.buscar(61).getEstado(), interfaz_inicial.listagrande.buscar(62).getEstado(), interfaz_inicial.listagrande.buscar(63).getEstado(), interfaz_inicial.listagrande.buscar(64).getEstado(), interfaz_inicial.listagrande.buscar(65).getEstado(),interfaz_inicial.listagrande.buscar(66).getEstado(),interfaz_inicial.listagrande.buscar(67).getEstado(),interfaz_inicial.listagrande.buscar(68).getEstado(),interfaz_inicial.listagrande.buscar(69).getEstado(),interfaz_inicial.listagrande.buscar(70).getEstado()},
                {interfaz_inicial.listagrande.buscar(71).getEstado(), interfaz_inicial.listagrande.buscar(72).getEstado(), interfaz_inicial.listagrande.buscar(73).getEstado(), interfaz_inicial.listagrande.buscar(74).getEstado(), interfaz_inicial.listagrande.buscar(75).getEstado(),interfaz_inicial.listagrande.buscar(76).getEstado(),interfaz_inicial.listagrande.buscar(77).getEstado(),interfaz_inicial.listagrande.buscar(78).getEstado(),interfaz_inicial.listagrande.buscar(79).getEstado(),interfaz_inicial.listagrande.buscar(80).getEstado()},
                {interfaz_inicial.listagrande.buscar(81).getEstado(), interfaz_inicial.listagrande.buscar(82).getEstado(), interfaz_inicial.listagrande.buscar(83).getEstado(), interfaz_inicial.listagrande.buscar(84).getEstado(), interfaz_inicial.listagrande.buscar(85).getEstado(),interfaz_inicial.listagrande.buscar(86).getEstado(),interfaz_inicial.listagrande.buscar(87).getEstado(),interfaz_inicial.listagrande.buscar(88).getEstado(),interfaz_inicial.listagrande.buscar(89).getEstado(),interfaz_inicial.listagrande.buscar(90).getEstado()},
                {3, interfaz_inicial.listagrande.buscar(92).getEstado(), interfaz_inicial.listagrande.buscar(93).getEstado(), interfaz_inicial.listagrande.buscar(94).getEstado(), interfaz_inicial.listagrande.buscar(95).getEstado(),interfaz_inicial.listagrande.buscar(96).getEstado(),interfaz_inicial.listagrande.buscar(97).getEstado(),interfaz_inicial.listagrande.buscar(98).getEstado(),interfaz_inicial.listagrande.buscar(99).getEstado(),interfaz_inicial.listagrande.buscar(100).getEstado()},};
        return laberinto;
        }
        return null;
    }
}

    

