/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author lucia
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
        long inicio = System.nanoTime();
        
        int n;
        System.out.println("\nIngrese el orden n de las matrices cuadradas: ");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        
        
        // b) Genere las matrices con números aleatorios.
        Random rand = new Random();
        
        //le mando los valores randoms
        ProductoMatrices.llenarMatrices(matrizA, rand, n);
        ProductoMatrices.llenarMatrices(matrizB, rand, n);
        
        System.out.println("\nMatriz A generada:"); //imprimo el mensaje "Matriz A Generada: "
        ProductoMatrices.imprimirMatriz(matrizA); //lo muestro

        System.out.println("\nMatriz B generada:");
        ProductoMatrices.imprimirMatriz(matrizB);
        
        int[][] matrizResultado = ProductoMatrices.Producto(matrizB, matrizB, n); //producto AxB
        
        System.out.println("\nProducto MatrizResultado = MatrizA x MatrizB: \n"); //imprimo
        ProductoMatrices.imprimirMatriz(matrizResultado); //lo muuestro
        System.out.println("");
        teclado.close(); //cierro el teclado
        
        //Analizo el tiempo
        /*c) Ejecute el programa con valores crecientes de n y mida el tiempo de ejecución
        desde que comienza el proceso del producto hasta que termina. Realice un gráfico
        de puntos con los valores obtenidos.
        */
        
        long fin = System.nanoTime();
        long duracion = fin - inicio;
        
        System.out.println("Tiempo de produccion de matrices de orden: " + n + "\tTiempo: " + duracion);
        
    }
    
}
