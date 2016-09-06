package arbolesv2;

public class Nodo {

    /*
    Definición de variables.
     */
    private Nodo padre, izquierda, derecha;
    private int dato;

    /*
    Constructor vacío.
    Por defecto no tiene padre, ni izquierda, ni derecha. 
    Y su dato será 0.
     */
    public Nodo() {
        this.padre = izquierda = derecha = null;
        this.dato = 0;
    }

    /*
    Constructor parametrizado, solamente recibe el dato.
    Debido a que estamos creando un nuevo nodo, solamente le
    ponemos el dato. El padre, su izquierda y su derecha siguen intactos
     */
    public Nodo(int dato) {
        this.padre = izquierda = derecha = null;
        this.dato = dato;
    }

    /*
    Getters y setters
     */
    public void establecerPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo obtenerNodoDeLaDerecha() {
        return derecha;
    }

    public Nodo obtenerNodoDeLaIzquierda() {
        return izquierda;
    }

    public void agregaNuevoNodoALaDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void agregaNuevoNodoALaIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public int obtenerDato() {
        return dato;
    }

    public boolean vaALaDerechaDe(Nodo n) {
        return this.obtenerDato() >= n.obtenerDato();
    }

    public boolean tieneEspacioALaDerecha() {
        return this.obtenerNodoDeLaDerecha() == null;
    }

    public boolean tieneEspacioALaIzquierda() {
        return this.obtenerNodoDeLaIzquierda() == null;
    }

}
