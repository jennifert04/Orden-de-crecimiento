/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;
import edu.princeton.cs.algs4.Stopwatch;
/**
 *
 * @author Jennifer
 */
public class Matriz {

    private double[][] matriz;
    private int orden;

    public Matriz(int orden) {
        this.orden = orden;
    }

    public Matriz(double matriz[][]) {
        this.matriz = matriz;
    }
    double temp[];
    double temp1;

    public Matriz sumaMatrices(Matriz m2) {
        try{
            if(matriz.length == m2.matriz.length && matriz[0].length == m2.matriz[0].length){
            double[][] matrizSuma = new double[matriz.length][m2.matriz[0].length];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    double pos1 = matriz[i][j];
                    double pos2 = m2.matriz[i][j];
                    double suma = pos1 + pos2;
                    matrizSuma[i][j] = suma;
                }
            }

            Matriz suma = new Matriz(matrizSuma);
            return suma;

            }
            else
                throw new Exception();            
        }
        catch(Exception e){
            return null;
        }        
    }

    public Matriz productoMatrices(Matriz m2) {
        try{
            if (matriz[0].length == m2.matriz.length) {
                double[][] matrizProducto = new double[matriz.length][m2.matriz[0].length];

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < m2.matriz[0].length; j++) {
                        for (int k = 0; k < matriz[0].length; k++) { //puede ser columnasA o filasB ya que deben ser iguales
                            matrizProducto[i][j] += matriz[i][k] * m2.matriz[k][j];
                        }
                    }
                }
                Matriz producto = new Matriz(matrizProducto);
                return producto;
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            return null;}
        
    }

    public boolean equals(Object o) {
        Matriz matriz2 = (Matriz) o;
        for (int i = 0; i < matriz2.matriz.length; i++) {
            for (int j = 0; j < matriz2.matriz[0].length; j++) {
                if (matriz[i][j] != matriz2.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public String toString(){
        String string_matriz="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                string_matriz += matriz[i][j] + " ";
            }
            string_matriz+="\n";
        }
        return string_matriz;
    }

    public Matriz CuadradoMagico(int n) {
        try{
            if((n-1)%2 == 0){

                double[][] cuadrado = new double[n][n];
                
                int i = n / 2;
                int j = n - 1;
                int m = n * n;

                for (int num = 1; num <= m;) {
                    if (i == -1 && j == n) 
                    {
                        j = n - 2;
                        i = 0;
                    } else {
                        
                        if (j == n) {
                            j = 0;
                        }

                        
                        if (i < 0) {
                            i = n - 1;
                        }
                    }

                    
                    if (cuadrado[i][j] != 0) {
                        j -= 2;
                        i++;
                        continue;
                    } else 
                    {
                        cuadrado[i][j] = num++;
                    }
                    j++;
                    i--;
                }
                Matriz cuadradomagico = new Matriz(cuadrado);

                return cuadradomagico;
            } 
        else{
            throw new Exception();
        }
        }
        catch(Exception e){
            
            return null;
        }  
    }

    public static void main(String[] args) { //prueba unitaria suma, producto, cuadrado mágico
         
        
        double[][] m1 = {
            {5, 8, 7},
            {11, 3, 10},
            {6, 3, 2},};
        double[][] m2 = {
            {4, 5, 3},
            {10, 5, 23},
            {8, 7, 9},};
        double[][] m3 = {//resultado suma
            {9, 13, 10},
            {21, 8, 33},
            {14, 10, 11},};
        double[][] m4 = {//resultado producto
            {156, 114, 262},
            {154, 140, 192},
            {70, 59, 105},};
        double[][] cuadrado = {//cuadrado magico
            {9, 3, 22, 16, 15},
            {2, 21, 20, 14, 8},
            {25, 19, 13, 7, 1},
            {18, 12, 6, 5, 24},
            {11, 10, 4, 23, 17},};
        
       

        Matriz matriz1 = new Matriz(m1);

        Matriz matriz2 = new Matriz(m2);

        Matriz matriz3 = new Matriz(m3);

        Matriz matriz4 = new Matriz(m4);

        Matriz mágico1 = new Matriz(5);

        Matriz cuadrado1 = new Matriz(cuadrado);
        
        
        assert (matriz1.sumaMatrices(matriz2).equals(matriz3));

        assert (matriz1.productoMatrices(matriz2).equals(matriz4));

        assert (mágico1.CuadradoMagico(5).equals(cuadrado1));
        
        Stopwatch w = new Stopwatch();
        Matriz mágico = new Matriz(4001);
        mágico.CuadradoMagico(4001);
        
        System.out.println("Tiempo: " + w.elapsedTime());

    }


}
