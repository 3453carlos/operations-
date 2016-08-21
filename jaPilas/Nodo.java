/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japilas;

/**
 *
 * @author parzibyte
 */
public class Nodo {
    private int dato;
    private Nodo ant;
    
    public Nodo() {
        this.dato = 0;
        this.ant = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.ant = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

       
}
