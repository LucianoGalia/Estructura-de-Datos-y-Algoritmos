/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author lucia
 */
public class Controlo {
    public static void main (String args[]) {
        Fila<Integer> fila = Fila.filaVacia();
        
        fila.enFila(1);
        fila.enFila(2);
        fila.enFila(3);
        fila.enFila(4);
        fila.enFila(5);
        
        System.out.println("\nLista original: ");
        fila.mostrarFila();
        
//        System.out.println("Pruebo deFila");
//        fila.deFila();
//        
//        System.out.println("\nLista modificada: ");
//        fila.mostrarFila();
        
        UsuarioADTFila.invertirFila(fila);
        System.out.println("\nLista invertida: ");
        fila.mostrarFila();
        
        UsuarioADTFila.invertirFila(fila);
        
        Fila<Integer> otraFila;
        otraFila = UsuarioADTFila.dividirFila(fila, 3);
        System.out.println("\nLista original (sin los primeros 3 elementos): ");
        fila.mostrarFila();
        System.out.println("\nLista nueva con los primeros 3 elementos de la anterior: ");
        otraFila.mostrarFila();
        
        // probando metodo unionFilas()
        System.out.println("\nUnion de las dos filas: ");
        Fila filaUnion = UsuarioADTFila.unirFilas(fila, otraFila);
        filaUnion.mostrarFila();
    }
}
