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
public class JaColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola colita = new Cola(500);
        colita.encolar(1);
        colita.encolar(2);
        colita.encolar(3);
        colita.encolar(4);
        colita.encolar(5);
        colita.encolar(6);
        int elemento = 1;
        System.out.printf("El número %d aparece %d veces\n", elemento, colita.frecuencia(elemento));
        System.out.printf("El número %d existe en la cola?? %s\n", elemento, String.valueOf(colita.existe(elemento)));
        System.out.printf("Los pares: %s\n", colita.pares());
        System.out.printf("Los pares: %s\n", colita.pares());
    }
    
}
