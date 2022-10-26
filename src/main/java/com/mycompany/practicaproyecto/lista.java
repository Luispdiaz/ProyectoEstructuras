/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaproyecto;

import java.util.Random;

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
        else if(aux < constante && aux > 1){
        return this.buscar(aux);
        }
        else if(aux>constante*constante+1-constante && aux<constante*constante){
        return this.buscar(aux);
        }
        else if(aux%constante==0 || aux%constante==0 + 1){
        return this.buscar(aux);
        }
    }
    }
    
    public lista arbolExpMinPrim(lista g) {
        // Obtengo la cantidad total de vértices
        Random rnd = new Random();
        int verticesTotales = g.getCantidad();
        vertice vOrigen = g.getEsquina(verticesTotales);
        if (vOrigen != null) {
            lista gNuevo = new lista();
            g.getVertices().stream().forEach((v) -> {
                gNuevo.agregarVertice(v.getContenido());
            });
            
            // Para esta implementación, los pesos son números enteros.
            PriorityQueue<Arco<T>> cola = new PriorityQueue<>((Arco a1, Arco a2) -> Integer.compare(a1.getPeso(), a2.getPeso()));

            int cont = 0;
            
            while (cont < verticesTotales) {
                for (Iterator<Arco> it = vOrigen.getArcos().iterator(); it.hasNext();) {
                    Arco<T> arc = it.next();
                    if (!arc.getDestino().isVisitado()) {
                        cola.offer(arc);
                    }
                }
                
                Arco<T> arco = cola.poll();
                if (!arco.getDestino().isVisitado()) {
                    arco.getDestino().setVisitado(true);
                    gNuevo.agregarArco(arco.getPrevio().getContenido(), arco.getDestino().getContenido(), arco.getPeso());
                    cont ++;
                    vOrigen = arco.getDestino();
                }
            }
            return gNuevo;
            
        }
        return null;
    }
}
}
