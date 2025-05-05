/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import static tp4.RedSocial.union;

/**
 *
 * @author lucia
 */
public class mainTp4 {
    public static void main(String args[]) {
        
        Usuario u1 = new Usuario("Norberto", "Rodriguez");
        Usuario u2 = new Usuario("Manuela", "Rodriguez");
        Usuario u3 = new Usuario("Laurita", "Del Castillo");
        Usuario u4 = new Usuario("Tomas", "Cabrera");
        
        RedSocial red1 = RedSocial.Crear();
        RedSocial red2 = RedSocial.Crear();
        
        red1.registrar(u1);
        red1.registrar(u2);
        red2.registrar(u3);
        red2.registrar(u4);
        
        System.out.println("Es vacia red1: " + red1.esVacia());
        
        System.out.println("Esta el usuario Norberto en red1?: " + red1.ESTA(u1));
        System.out.println("Esta el usuario Norberto en red2?: " + red2.ESTA(u1));
        
        RedSocial redUnion = union(red1, red2);
        System.out.println("Cantidad de usuarios en redUnion: " + redUnion.cantidad());
        
        System.out.println(redUnion.ultimoUsuario().getNombre());
        System.out.println(redUnion.echar(u4).ultimoUsuario().getNombre());
        System.out.println(redUnion.echar(u2).ultimoUsuario().getNombre());
        System.out.println(redUnion.echar(u3).ultimoUsuario().getNombre());
        
        System.out.println("Es vacia red1: " + red1.esVacia()); // se vacia despues de llamar a union
        
        System.out.println("Cantidad de usuarios en redUnion: " + redUnion.cantidad());
        System.out.println("Cantidad de usuarios en red1: " + red1.cantidad());
        
          
        
        
    }
}
