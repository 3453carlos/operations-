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
public class Pila {
    private Nodo inicio, fin;
    
    public Pila(){
        this.inicio = null;
        this.fin = null;
    }
    
    public Pila(int dato){
        Nodo nodo = new Nodo(dato);
        this.inicio = nodo;
        this.fin = nodo;
    }
    
    public void empilar(int dato){
        Nodo nodo = new Nodo(dato);
        if(this.esVacia()){
            this.inicio = nodo;
            this.fin = nodo;
        }else{
            nodo.setAnt(this.fin);
            this.fin = nodo;
        }
    }
    
    public void desempilar(){
        if(!this.esVacia()) {
            Nodo n;
            n = this.fin.getAnt();
            this.fin = null;
            this.fin = n;
        }
    }
    public void desempilar2(){
        if(!this.esVacia()) {
            this.fin = this.fin.getAnt();
        }
    }
    
    public void vaciar(){
        if(!this.esVacia()){
            this.inicio = null;
            this.fin = null;
        }
    }
    
    public int cima(){
        return this.fin.getDato();
    }
    
    public boolean esVacia(){
        return (this.inicio == null && this.fin == null);
    }

    public String toString(){
        if(this.esVacia()){
            return "Todavía no hay datos";
        }else{
            String r = "";
            Nodo n = this.fin;
            while(n != null){
                r = n.getDato() + "," + r;
                n = n.getAnt();
            }
            return r;
        }   
    }
    
    public int tamaño(){
        if(this.esVacia()) return 0;
        else{
            Nodo n = this.fin;
            int c = 1;
            while(n.getAnt() != null){
                c++;
                n = n.getAnt();
            }
            return c;
        }  
    }
    
}
