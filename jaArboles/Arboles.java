/* 
 * This program is free software: you can redistribute it and/or modify  
 * it under the terms of the GNU General Public License as published by  
 * the Free Software Foundation, version 3.
 *
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License 
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package arboles;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author parzibyte
 */
public class Arboles {

    public static int dameValorAleatorio(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbolito = new Arbol(); //Instanciamos un nuevo árbol
        /*
        Llenamos el árbol con datos aleatorios. No es importante
        prestarle atención al método para hacerlo, ya que no importa.
        */
        for (int x = 0; x <= 10; x++) {
            arbolito.agregar(dameValorAleatorio(1, 100));
        }
        //Después recorremos el árbol de tres maneras distintas
        System.out.println("Tamaño:" + arbolito.tamaño());
    }

}
