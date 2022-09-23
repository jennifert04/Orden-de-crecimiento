/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

/**
 *
 * @author Jennifer
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[][] m1 = {
                {10, 5, 12},
                {98, 5, 6},
                {8, 4, 6},
        };
        double[][] m2 = {
                {8, 7, 5},
                {19, 56, 4},
                {8, 76, 90},
        };
        
        Matriz matriz1 = new Matriz(m1);
        Matriz matriz2 = new Matriz(m2);
        Matriz matriz3 = new Matriz(5);
        
        System.out.println("Suma de matrices");
        System.out.println((matriz1.sumaMatrices(matriz2)).toString());
        
        System.out.println("Producto de matrices");
        System.out.println((matriz1.productoMatrices(matriz2)).toString());
       
        System.out.println("Cuadrado mágico");
        System.out.println((matriz3.CuadradoMagico(matriz3.getOrden()).toString()));
        
    }
  
}
