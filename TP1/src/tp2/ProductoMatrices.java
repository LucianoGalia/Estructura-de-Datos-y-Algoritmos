/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;


import java.util.Random;
/**
 *
 * @author lucia
 */
public class ProductoMatrices {
    
    //Punto 4) a) Escriba un programa en Java que calcule el producto de 2 matrices cuadradas de orden n x n
    /*Leer (n,B,C)
        Para i desde 1 hasta n hacer
            Para j desde 1 hasta n hacer
                A (i,j)  0
                Para k desde 1 hasta n hacer
                    A (i,j)  A (i,j) + B (i,k) * C (k,j)
    Escribir (A)
    */
    
    //Primero hago una matriz con un metodo unico de clase
    
    public static void llenarMatrices(int Matriz[][], Random rand, int n ) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Matriz[i][j] = rand.nextInt(100); // números del 0 al 9
            }
        }
    }
    
    public static int[][] Producto(int[][] matriz1, int[][] matriz2, int n) {
        int[][] MatrizAux = new int[n][n];

        for (int i = 0; i < n; i++) { //O(n)
            for (int j = 0; j < n; j++) { //O(n)
                MatrizAux[i][j] = 0; 
                for (int k = 0; k < n; k++) {
                    MatrizAux[i][j] = MatrizAux[i][j] + matriz1[i][k] * matriz2[k][j];
                }
            }
    }
        
    return MatrizAux;
    
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    
    
}
