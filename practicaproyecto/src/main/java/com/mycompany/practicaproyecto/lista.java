/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaproyecto;

import java.util.Random {
/**
 *
 * @author Luisp
 */
public class lista {
    private vertice pFirst;
    private vertice pLast;
    private int cantidad;

    public lista() {
        this.pFirst = null;
        this.pLast = null;
        this.cantidad = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public vertice getpFirst() {
        return pFirst;
    }

    public vertice getpLast() {
        return pLast;
    }

    public void setpLast(vertice pLast) {
        this.pLast = pLast;
    }

    public void setpFirst(vertice pFirst) {
        this.pFirst = pFirst;
    }
    
    public boolean vacio(){
    return this.getpFirst() == null;
    }
    
    public void insertar(vertice nuevo){
    if (!this.vacio()){
    vertice aux = this.getpLast();
    aux.setpNext(nuevo);
    this.setpLast(nuevo);
    this.setCantidad(this.getCantidad()+1);
    }
    else{
    this.setpFirst(nuevo);
    this.setpLast(nuevo);
    this.setCantidad(1);
    }
    }
    
    public vertice buscar(int posicion){
    vertice aux = this.getpFirst();
    for(int i = 1; i<posicion; i++){
    aux = aux.getpNext();
    }
    return aux;
    }
    
    public vertice buscarArriba(int numVertice, int input){
    vertice aux = this.getpFirst();
    while(aux != this.buscar(numVertice + input)){
    aux = aux.getpNext();
    }
    return aux;  
}
    public vertice buscarAbajo(int numVertice, int input){
    vertice aux = this.getpFirst();
    while(aux != this.buscar(input-numVertice)){
    aux = aux.getpNext();
    }
    return aux;
    }
    public vertice getEsquina(int constante){
        Random rnd = new Random();
        while (true){
        int aux = rnd.nextInt(constante);
        if(aux==1){
        return this.buscar(aux);
        }
        else if(aux==constante){
        return this.buscar(aux);
        }
        else if(aux==constante*constante+1-constante){
        return this.buscar(aux);
        }
        else if(aux==constante*constante){
        return this.buscar(aux);
        }
        }
    }
        
    public vertice getEsquinacontraria(int constante, int input){
    if(constante==1){
        return this.buscar(constante);
        }
    else if(constante==input){
        return this.buscar(constante);
        }
    else if(constante==input*input+1-input){
        return this.buscar(constante);
        }
    else if(constante==input*input){
        return this.buscar(constante);
        }
    return null;
    }
        
    
    public lista arbolExpMinPrim(lista g) {
        int verticesTotales = g.getCantidad();
        vertice vOrigen = g.getEsquina(verticesTotales).setEstado(1);
        g.getEsquinacontraria(vOrigen.getNumVertice(), verticesTotales).setEstado(1);
        lista gNuevo = new lista();
        for (vertice i=g.getpFirst(); i==g.getpLast();i.getpNext()){
            lista listaadyacencia = new lista();
            vertice nuevo = new vertice(i.getNumVertice(),listaadyacencia);
            if (i.getEstado()!=2){
                i.setEstado(1);
                for(vertice j=i.getListaadyacencia().getpFirst();j==i.getListaadyacencia().getpLast();j.getpNext()){
                    if (j.getEstado()==1){
                    nuevo.getListaadyacencia().insertar(j);
                    }
                    else{
                    Random rd = new Random();
                    boolean aux1 = rd.nextBoolean();
                    if (aux1 == true){
                    nuevo.getListaadyacencia().insertar(j);
                    }
                    else{
                    i.setEstado(2);
                    }
                    }
                    }
                    gNuevo.insertar(nuevo);
                }
        }
        return gNuevo;
    }
}