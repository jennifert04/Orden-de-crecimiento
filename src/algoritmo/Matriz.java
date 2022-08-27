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
public class Matriz {

    private double[][] matriz;

    public Matriz(double matriz[][]) {
        this.matriz = matriz;
    }
    double temp[];
    double temp1;

    public Matriz sumaMatrices(Matriz m2) {

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

    public Matriz productoMatrices(Matriz m2) {

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
        return false;
    }

    public void CuadradoMagico(int n) {

        int[][] magicSquare = new int[n][n];
 
        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;
        int orden = n*n;
        // One by one put all values in magic square
        for (int num = 1; num <= orden;) {
            if (i == -1 && j == n) // 3rd condition
            {
                j = n - 2;
                i = 0;
            }
            else {
                // 1st condition helper if next number
                // goes to out of square's right side
                if (j == n)
                    j = 0;
 
                // 1st condition helper if next number is
                // goes to out of square's upper side
                if (i < 0)
                    i = n - 1;
            }
 
            // 2nd condition
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            }
            else
                // set number
                magicSquare[i][j] = num++;
 
            // 1st condition
            j++;
            i--;
        }
 
        // print magic square
        System.out.println("The Magic Square for " + n
                           + ":");
        System.out.println("Sum of each row or column "
                           + n * (n * n + 1) / 2 + ":");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(magicSquare[i][j] + " ");
            System.out.println();
        }

    }   

    public static void main(String[] args) { //prueba unitaria suma y producto
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

        Matriz matriz1 = new Matriz(m1);

        Matriz matriz2 = new Matriz(m2);

        Matriz matriz3 = new Matriz(m3);

        Matriz matriz4 = new Matriz(m4);

        assert (matriz1.sumaMatrices(matriz2).equals(matriz3));

        assert (matriz1.productoMatrices(matriz2).equals(matriz4));

    }
         
}

