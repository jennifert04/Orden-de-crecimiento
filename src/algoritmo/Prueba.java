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
public class Prueba {
    public static void main(String[] args) {
        int orden = 3;
        
        int matriz[][] = new int[3][3];
        
        int i=(orden - 1)/2;
        int j=(orden - 1)/2;
        int cont = 1;
        
        
        matriz[i][j] = cont;
        cont = 2;
        if(i-1<0&&j+1<matriz.length){//en el caso de que se salga de la matriz
            i = i - 1;
            //para recorrer columnas
            for(int k = matriz.length-1; k >= 0; k--){
                
                if(matriz[i][k] == 0){
                    matriz[i][k] = cont;
                    cont++;
                    break;
                }
                
            }
        }else if(matriz[i-1][j+1] == 0){
            matriz[i-1][j+1]= cont;
            cont++;
            i--;
            j++;
        }else if(matriz[i-1][j] == 0){
            matriz[i-1][j]=cont;
            cont++;
            i--;
        }else if(j+1>matriz.length-1&&i-1>0){//se sale de la matriz
            //recorrer filas
            for(int k = 0; k < matriz.length; k++){
                if(matriz[i-1][k] == 0){
                    matriz[i-1][k] = cont;
                    i--;
                    j = k;
                    cont++;
                    break;
                }
            }
            
        }else if(i-1<0 && j+1 > matriz.length){//se sale de la matriz, no hay mas filas ni mas columnas
            for(int k =matriz.length-1; k >= 0; k--){
                if(matriz[k][j] == 0){
                    matriz[k][j] = cont;
                    i = k;
                    cont++;
                    break;
                }
            }
        }
        
    }
    
}
