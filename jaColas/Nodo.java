/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacolas;

/**
 *
 * @author parzibyte
 */
public class Nodo {
    private int dato;
    private Nodo sig;
    
    public Nodo() {
        this.dato = 0;
        this.sig = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.sig = null;
    }

    public int getDato() {
        return this.dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return this.sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
     
}
