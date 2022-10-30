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

// Se contruye la clase Lista con sus constructores
public class lista {

    private vertice pFirst;
    private vertice pLast;
    private int cantidad;
    static vertice vOrigen;
    static vertice vFinal;

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
    
    // Metodo para verificar si la lista esta vacia.
    public boolean vacio() {
        return this.getpFirst() == null;
    }
    
    // Metodo para insertar vertice.
    public void insertar(vertice nuevo) {
        if (!this.vacio()) {
            vertice aux = this.getpLast();
            aux.setpNext(nuevo);
            this.setpLast(nuevo);
            this.getpLast().setpPrev(aux);
            this.setCantidad(this.getCantidad() + 1);
        } else {
            this.setpFirst(nuevo);
            this.setpLast(nuevo);
            this.setCantidad(1);
        }
    }
    
    // Metodo para buscar un vertice.
    public vertice buscar(int posicion) {
        vertice aux = this.getpFirst();
        for (int i = 1; i < posicion; i++) {
            aux = aux.getpNext();
        }
        return aux;
    }
    
    // Metodo para buscar arriba.
    public vertice buscarArriba(int numVertice, int input) {
        vertice aux = this.getpFirst();
        while (aux != this.buscar(numVertice - input)) {
            aux = aux.getpNext();
        }
        return aux;
    }
    
    // Metodo para buscar abajo.
    public vertice buscarAbajo(int numVertice, int input) {
        vertice aux = this.getpFirst();
        while (aux != this.buscar(input + numVertice)) {
            aux = aux.getpNext();
        }
        return aux;
    }
    
    // Metodo random para obtener la esquina que sera el inicio del laberinto.
    public vertice getEsquina(int constante, int input) {
        Random rnd = new Random();
        while (true) {
            int aux = rnd.nextInt(constante);
            if (aux == 1) {
                return this.buscar(aux);
            } else if (aux == input) {
                return this.buscar(aux);
            } else if (aux == input * input + 1 - input) {
                return this.buscar(aux);
            } else if (aux == input * input) {
                return this.buscar(aux);
            }
        }

    }
    
    // Metodo para encontrar la esquina contraria que sera el final del laberinto.
    public vertice getEsquinacontraria(int constante, int input) {
        if (constante == 1) {
            return this.getpLast();
        } else if (constante == input) {
            return this.buscar(input * input + 1 - input);
        } else if (constante == input * input + 1 - input) {
            return this.buscar(input);
        } else if (constante == input * input) {
            return this.buscar(1);
        }
        return null;
    }
    
    // Algoritmo de prim.
    public lista arbolExpMinPrim(int input) {
        int verticesTotales = this.getCantidad();
        lista listaadyacencia2 = new lista();
        vOrigen = new vertice(0, listaadyacencia2);
        vOrigen = this.getEsquina(verticesTotales, input);
        vOrigen.setEstado(3);
        vFinal = new vertice(0, listaadyacencia2);
        vFinal = this.getEsquinacontraria(vOrigen.getNumVertice(), input);
        vFinal.setEstado(4);
        lista gNuevo = new lista();
        for (vertice i = this.getpFirst(); i != null; i = i.getpNext()) {
            lista listaadyacencia = new lista();
            vertice nuevo = new vertice(i.getNumVertice(), listaadyacencia);
            if (i.getEstado() != 2) {
                i.setEstado(1);
                OUTER:
                for (vertice j = i.getListaadyacencia().getpFirst(); j != null; j = j.getpNext()) {
                    vertice aux = this.getpFirst();
                    while (aux.getNumVertice() != j.getNumVertice()) {
                        aux = aux.getpNext();
                    }
                    switch (aux.getEstado()) {
                        case 1 -> {
                            vertice nuevoadyacencia2 = this.CopiarDato(j);
                            nuevo.getListaadyacencia().insertar(nuevoadyacencia2);
                        }
                        case 2 -> {
                            break OUTER;
                        }
                        default -> {
                            Random rd = new Random();
                            boolean aux1 = rd.nextBoolean();
                            if (aux1 == true) {
                                vertice nuevoadyacencia = this.CopiarDato(j);
                                nuevo.getListaadyacencia().insertar(nuevoadyacencia);
                                vertice aux3 = this.getpFirst();
                                while (aux3.getNumVertice() != j.getNumVertice()) {
                                    aux3 = aux3.getpNext();
                                }
                                aux3.setEstado(1);
                            } else {
                                vertice aux2 = this.getpFirst();
                                while (aux2.getNumVertice() != j.getNumVertice()) {
                                    aux2 = aux2.getpNext();
                                }
                                aux2.setEstado(2);
                            }
                        }
                    }
                }
            }
            gNuevo.insertar(nuevo);
        }
        return gNuevo;
    }
    
    // Metodo para copiar los valores de un vertice. 
    public vertice CopiarDato(vertice nodo) {
        lista listaadyacencia = new lista();
        vertice nuevo = new vertice(nodo.getNumVertice(), listaadyacencia);
        return nuevo;
    }
}
