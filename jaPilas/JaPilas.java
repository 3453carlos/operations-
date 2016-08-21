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
public class JaPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila p = new Pila();
        System.out.println("Todos los datos antes de empilar: " + p);
        p.empilar(1);
        p.empilar(2);
        p.empilar(3);
        p.empilar(34);
        p.empilar(6);
        p.empilar(6);
        p.empilar(6);
        p.empilar(6);
        System.out.println("Después de empilar:" + p);
        p.desempilar2();
        p.desempilar2();
        System.out.println("Después de desempilar:" + p);
        p.empilar(4);
        p.empilar(8);
        System.out.println("Después de empilar:" + p);
        p.vaciar();
        System.out.println("Después de vaciar:" + p);
        p.empilar(22222);
        p.empilar(2);
        p.desempilar2();
        System.out.println("Después de empilar después de vaciar:" + p);
    }
    
}
