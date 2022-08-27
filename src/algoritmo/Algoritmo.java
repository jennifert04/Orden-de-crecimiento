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
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String id1 = "000451560";
        String id2 = "000462017";
        int num = hashsID(id2, id1);
        System.out.println(num);

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
        //Matriz matriz1 = new Matriz(m1);
        
        //Matriz matriz2 = new Matriz(m2);
        
        //matriz1.InversaMatriz();
        Matriz m4 = new Matriz(m2);
        m4.CuadradoMagico(5);
        
        
        
        
    }
    public static int hashsID (String id1, String id2){
        int num;
        String cadena = id1 + id2;
        num = cadena.hashCode()%5;
        return num;
    }
    
    
}
