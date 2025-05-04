/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import static tp3.Metodos.DigitoAusente;
import static tp3.Metodos.esPalindromo;

/**
 *
 * @author lucia
 */
public class Parte3 {
    
    
    
    public static void main(String[] args) {
        
        /*1) Diseñe una función recursiva llamada DigitoAusente, que determine si un
        dígito D NO PERTENECE al número dado.*/
        
//        int numero = 12345;
//        int digito = 7;
//        
//        if (DigitoAusente(numero, digito)) {
//            System.out.println("El digito " + digito + " NO esta en el numero " + numero);
//        } else {
//            System.out.println("El digito " + digito + " Si esta en el numero " + numero);
//        }
        //funciona!
        
        //SIGUIENTE...
        
        
        /*2) Diseñe un algoritmo recursivo que dado un vector de caracteres, determine si
        el vector contiene una palabra palíndrome.
        */  
        
//        char[] palabra1 = {'a', 'n', 'a'}; // true
//        char[] palabra2 = {'r', 'e', 'c', 'o', 'n', 'o', 'c', 'e', 'r'}; // true
//        char[] palabra3 = {'j', 'a', 'v', 'a'}; // false
//        char[] palabra4 = {'a'}; // true
//        char[] palabra5 = {}; // true (vacío)
//        System.out.println("\n Analizo palabras Palindromes\n");
//        System.out.println("'ana' es palindromo? --> " + esPalindromo(palabra1));
//        System.out.println("");
//        System.out.println("'reconocer' es palindromo? --> " + esPalindromo(palabra2));
//        System.out.println("");
//        System.out.println("'java' es palindromo? --> " + esPalindromo(palabra3));
//        System.out.println("");
//        System.out.println("'a' es palindromo? --> " + esPalindromo(palabra4));
//        System.out.println("");
//        System.out.println("'' (vacio) es palindromo? --> " + esPalindromo(palabra5));
        
       
//       ListaEnlazadaEnteros lista = new ListaEnlazadaEnteros();
//        
//        // Insertamos valores
//        lista.insertar(5);
//        lista.insertar(2);
//        lista.insertar(8);
//        lista.insertar(3);
//        lista.insertar(10);
//        
//        System.out.println("Lista original:");
//        lista.imprimir();
//        
//        int umbral = 4;
//        int suma = lista.sumaMayoresQue(umbral);
//        
//        System.out.println("\nSuma de valores > " + umbral + ": " + suma);
        
        
        
        /*5) Agregue un método recursivo llamado mayor a la clase ListaEnlazada, que
            devuelva el valor mayor en la lista.*/
        
        
        ListaEnlazadaEnteros lista = new ListaEnlazadaEnteros();
        lista.insertar(5);
        lista.insertar(9);
        lista.insertar(3);
        lista.insertar(7);

        System.out.println("El mayor valor es: " + lista.mayor()); // Imprime 9
        
        
    }
}
