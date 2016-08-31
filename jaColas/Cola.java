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
public class Cola {
    private Nodo inicio;

    public Cola(){
        this.inicio = null;
    }
    
    public Cola(int dato){
        this.inicio = new Nodo(dato);
    }
    public Nodo getInicio() {
        return this.inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    public void encolar(int dato){
        if(!this.estaVacia()){
            Nodo nodito = this.inicio;
            while(nodito.getSig() != null){
                nodito = nodito.getSig();
            }
            nodito.setSig(new Nodo(dato));
        }else{
            this.inicio = new Nodo(dato);
        }
        System.out.printf("Llamada a encolar con el dato %d.\nAhora la cola es: %s\n", dato, this.estadoCola());
    }
    public void vaciar(){
        if(!this.estaVacia()) this.inicio = null;
    }
    public int buscarElemento(int busqueda){
        Nodo n = this.inicio;
        int contador = 0;
        while(n != null){
            if(n.getDato() == busqueda) return contador;
            contador++;
            n = n.getSig();
        }
        return -1;
    }
    
    public void encolarMayor(int dato){
        if(dato >= this.cima()) this.encolar(dato);
        else System.out.println("No puedes encolar, amigo");
    }
    
    public int cima(){
        Nodo n = this.inicio;
        while(n != null){
            n = n.getSig();
        }
        return n.getDato();
    }
    
    public int frecuencia(int elemento){
        Nodo n = this.inicio;
        int contador = 0;
        while(n != null){
            if(n.getDato() == elemento) contador++;
            n = n.getSig();
        }
        return (contador > 0) ? contador : -1;
    }
    
    public boolean existe(int dato){
        Nodo n = this.inicio;
        while(n != null){
            if(n.getDato() == dato) return true;
            n = n.getSig();
        }
        return false;
    }
    
    public String pares(){
        Nodo n = this.inicio;
        String r = "";
        while(n != null){
            if(n.getDato() %2 == 0) r += String.valueOf(n.getDato()) + "\n";
            n = n.getSig();
        }
        return r;
    }
    
    public void desencolar(){
         if(!this.estaVacia()) {
            System.out.printf("Llamada a desencolar, el dato quitado es %d.\n", this.inicio.getDato());
            Nodo n = this.inicio.getSig();
            this.inicio = n;
            System.out.printf("Ahora la cola es: %s\n", this.estadoCola());
        }else{
             System.out.println("Error: No se puede desencolar porque la cola está vacía :c\n");
         }
    }
    
    public boolean estaVacia(){
        return this.inicio == null;
    }
    
    public String estadoCola(){
         if(this.estaVacia()){
            return "La cola está vacía :)";
        }else{
            String r = "";
            Nodo n = this.inicio;
            int contador = 0;
            while(n != null){
                r += "[" + String.valueOf(contador) + "]=>" + n.getDato();
                n = n.getSig();
                contador++;
            }
            return r + "[FIN DE LA COLA]";
        } 
    }
    
}
