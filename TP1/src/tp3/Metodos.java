/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author lucia
 */
public class Metodos {
    /*1) Diseñe una función recursiva llamada DigitoAusente, que determine si un
    dígito D NO PERTENECE al número dado.*/
    
    public static boolean DigitoAusente(int num, int digit) {
        if (num == 0){ // Caso Base 1: Si el número es 0, el dígito no está presente.
            return true;
        }
        
        if(num % 10 == digit) { // Caso Base 2: Si el último dígito es igual a D, el dígito está presente
        return false;
    }
        return DigitoAusente(num / 10, digit); // Caso Recursivo: Llamar a la función con el número sin el último dígito
    }
    
    /*2) Diseñe un algoritmo recursivo que dado un vector de caracteres, determine si
    el vector contiene una palabra palíndrome.
    */
    
    public static boolean esPalindromo (char[] vectorC){ // Función recursiva principal 
        return esPalindromoRec(vectorC, 0, vectorC.length - 1);
    }
    
    // Función recursiva auxiliar con índices
    private static boolean esPalindromoRec(char[] palabra, int inicio, int fin) { //privada por ser aux
        // Caso Base 1: Subvector de tamaño 0 o 1
        if (inicio >= fin) {
            return true;
        }
        // Caso Base 2: Caracteres diferentes en los extremos
        if (palabra[inicio] != palabra[fin]) {
            return false;
        }
        // Paso Recursivo: Verificar el subvector interno
        return esPalindromoRec(palabra, inicio + 1, fin - 1);
    }
    
}
