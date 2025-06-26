/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticoParcial2;

/**
 *
 * @author lucia
 */
public class prueba {
    public static void main(String args[]) {
        
        Fila<String> fila = Fila.filaVacia();
        
        fila.enFila("H");
        fila.enFila("o");
        fila.enFila("l");
        fila.enFila("a");
        
        System.out.println("- Muestro Fila:");
        
        fila.Mostrar();
        System.out.println("\n- cantidad: " + fila.cantidad() + "\n");
//        System.out.println("\ndeFila:");
//        fila.deFila();
//        fila.Mostrar();
        System.out.println("\n- Mi frente es: " + fila.Frente());
        System.out.println("\n- Agrego 4 elementos 's' ");
        fila.enFilaN("s", 4);
        fila.Mostrar();
        
//        System.out.println("\nAgrego la H al final: ");
//        fila.reEnfilar();
//        fila.Mostrar();
        System.out.println("\n- Borro las s: ");
        fila.Borrar("s");
        fila.Mostrar();
        System.out.println("Pertenece el valor a?: " +  fila.pertenece("a"));
        System.out.println("Pertenece el valor x?: " +  fila.pertenece("x"));
        
        System.out.println("perteneceRecursivo el valor a?: " +  fila.perteneceRecursivo("a"));
        System.out.println("perteneceRecursivo el valor x?: " +  fila.perteneceRecursivo("x"));
        
//        System.out.println("\n- Ahora doy vuelta el Hola: ");
//        fila.invertir(fila);
//        fila.Mostrar();

        Fila<String> fila2 = Fila.filaVacia();
        
        fila2.enFila("T");
        fila2.enFila("e");
        fila2.enFila("l");
        fila2.enFila("e");
        
        Fila<String> filaUnion = Fila.filaVacia();
//        filaUnion= filaUnion.concat(fila, fila2);
//        System.out.println("\nMuestro f1 y f2 juntos: ");
        filaUnion = ADTFila.concatADT(fila, fila2);
        filaUnion.Mostrar();
    }
}
