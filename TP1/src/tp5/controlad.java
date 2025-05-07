/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author lucia
 */
public class controlad {
    public static void main(String args[]) {
        
        Pila p1 = Pila.Crear();
        
        p1.Push(1);
        p1.Push(2);
        p1.Push(3);
        p1.Push(4);
        
        System.out.println("La pila es: ");
        p1.mostrar();
        
        System.out.println("La cantidad es: " + p1.cantidad());
        System.out.println("\nQuiero borrar el ultimo elemento (4)");
        p1.Pop();
        
        p1.mostrar();
        
        System.out.println("El ultimo elemento de mi pila es: " + p1.Fondo());
        System.out.println("\nEl primero es: " + p1.Top());
        
        
    }
    
}
