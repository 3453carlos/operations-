package arboles;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public Arbol(int dato) {
        this.raiz = new Nodo(dato);
        this.raiz.establecerPadre(raiz);
    }

    public Nodo obtenerRaiz() {
        return raiz;
    }

    public void establecerRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public boolean estaVacio() {
        return this.obtenerRaiz() == null;
    }

    public void agregar(int dato) {
        System.out.println("Agregado dato " + String.valueOf(dato));
        Nodo n = new Nodo(dato);
        if (this.estaVacio()) {
            this.establecerRaiz(n);
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

    public boolean existe(Nodo n, int valor) {
        if (n != null) {
            if (n.obtenerDato() == valor) {
                return true;
            }
            inorden(n.obtenerNodoDeLaIzquierda());
            inorden(n.obtenerNodoDeLaDerecha());
        }
        return false;
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
                preorden(this.obtenerRaiz());
                break;
            case "inorden":
                inorden(this.obtenerRaiz());
                break;
            case "postorden":
                postorden(this.obtenerRaiz());
                break;
        }
    }

    public int tamaño() {
        return tamaño(this.obtenerRaiz());
    }

    private int tamaño(Nodo n) {
        if (n == null) {
            return 0;
        } else {
            return (tamaño(n.obtenerNodoDeLaIzquierda()) + 1 + tamaño(n.obtenerNodoDeLaDerecha()));
        }
    }

}
