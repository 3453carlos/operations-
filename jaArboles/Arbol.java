package arbolesv2;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public Arbol(int dato) {
        this.raiz = new Nodo(dato);
        this.raiz.establecerPadre(raiz);
    }

    public Nodo obtenerNodoRaiz() {
        return raiz;
    }

    public void establecerNodoRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public boolean estaVacio() {
        return this.obtenerNodoRaiz() == null;
    }

    public void agregar(int dato) {
        System.out.println("Agregado dato " + String.valueOf(dato));
        Nodo n = new Nodo(dato);
        if (this.estaVacio()) {
            this.establecerNodoRaiz(n);
            n.establecerPadre(raiz);
        } else {
            agregar(this.raiz, n);
        }
    }

    public void agregar(Nodo actual, Nodo nuevoNodo) {
        if (nuevoNodo.vaALaDerechaDe(actual)) {
            if (actual.tieneEspacioALaDerecha()) {
                actual.agregaNuevoNodoALaDerecha(nuevoNodo);
                nuevoNodo.establecerPadre(actual);
            } else {
                agregar(actual.obtenerNodoDeLaDerecha(), nuevoNodo);
            }
        } else if (actual.tieneEspacioALaIzquierda()) {
            actual.agregaNuevoNodoALaIzquierda(nuevoNodo);
            nuevoNodo.establecerPadre(actual);
        } else {
            agregar(actual.obtenerNodoDeLaIzquierda(), nuevoNodo);
        }
    }

    public void preorden(Nodo actual) {
        /*
        Primero la raíz, luego la izquierda y al final la derecha
         */
        if (actual != null) {
            System.out.println("Ahora estoy en el nodo con el valor " + actual.obtenerDato());
            preorden(actual.obtenerNodoDeLaIzquierda());
            preorden(actual.obtenerNodoDeLaDerecha());
        }
    }

    public void inorden(Nodo actual) {
        /*
        Primero la izquierda, luego la raíz y al final la derecha
         */
        if (actual != null) {
            inorden(actual.obtenerNodoDeLaIzquierda());
            System.out.println("Ahora estoy en el nodo con el valor " + actual.obtenerDato());
            inorden(actual.obtenerNodoDeLaDerecha());
        }
    }

    public void postorden(Nodo actual) {
        /*
        Primero la izquierda, luego la derecha y al final la raíz
         */
        if (actual != null) {
            postorden(actual.obtenerNodoDeLaIzquierda());
            postorden(actual.obtenerNodoDeLaDerecha());
            System.out.println("Ahora estoy en el nodo con el valor " + actual.obtenerDato());
        }
    }

    public void recorrer(String orden) {
        orden = orden.toLowerCase();
        switch (orden) {
            case "preorden":
            default:
                preorden(this.obtenerNodoRaiz());
                break;
            case "inorden":
                inorden(this.obtenerNodoRaiz());
                break;
            case "postorden":
                postorden(this.obtenerNodoRaiz());
                break;
        }
    }

    public int tamaño() {
        return tamaño(this.obtenerNodoRaiz());
    }

    private int tamaño(Nodo n) {
        if (n == null) {
            return 0;
        } else {
            return (tamaño(n.obtenerNodoDeLaIzquierda()) + 1 + tamaño(n.obtenerNodoDeLaDerecha()));
        }
    }

    public int frecuencia(int busqueda) {
        return frecuencia(this.obtenerNodoRaiz(), busqueda);
    }

    private int frecuencia(Nodo n, int busqueda) {
        return (n == null) ? 0 : (n.obtenerDato() == busqueda) ? frecuencia(n.obtenerNodoDeLaIzquierda(), busqueda) + 1 + frecuencia(n.obtenerNodoDeLaDerecha(), busqueda) : frecuencia(n.obtenerNodoDeLaIzquierda(), busqueda) + 0 + frecuencia(n.obtenerNodoDeLaDerecha(), busqueda);
    }

    public int cantidadPares() {
        return this.cantidadPares(this.obtenerNodoRaiz());
    }

    private int cantidadPares(Nodo n) {
        return (n == null) ? 0 : (n.obtenerDato() % 2 == 0) ? cantidadPares(n.obtenerNodoDeLaIzquierda()) + 1 + cantidadPares(n.obtenerNodoDeLaDerecha()) : cantidadPares(n.obtenerNodoDeLaIzquierda()) + 0 + cantidadPares(n.obtenerNodoDeLaDerecha());
    }

    public int cantidadImpares() {
        return this.tamaño() - this.cantidadPares();
    }

    public boolean existe(int busqueda) {
        if(this.estaVacio()) return false;
        else return this.existe(this.obtenerNodoRaiz(), busqueda);
    }

    private boolean existe(Nodo n, int busqueda) {
        return false;
    }
}
