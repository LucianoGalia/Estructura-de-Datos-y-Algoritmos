/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author lucia
 */
public class main {
    
    public static void main(String args[]) {
        ArbolBinario raiz = ArbolBinario.aBVacio();
        ArbolBinario izquierdo = ArbolBinario.aBVacio();
        ArbolBinario derecho = ArbolBinario.aBVacio();
        
        izquierdo = ArbolBinario.armarAB(null, 'b', null);
        raiz = ArbolBinario.armarAB(izquierdo, 'a', derecho);
        
        raiz.mostrarArbol();
        
        System.out.println("\n- Muestro nuevo ArbolB: \n");
        
        derecho = ArbolBinario.armarAB(null, 'd', null);
        raiz = ArbolBinario.armarAB(izquierdo, 'a', derecho);
        raiz.mostrarArbol();
        
        System.out.println("\nPertenece d?: " + raiz.pertenece('d'));
        System.out.println("\nPertenece c?: " + raiz.pertenece('c'));
        
        
        String expresion = "13+5*2+=";
        
        //ArbolBinario arbolExpresion = ArbolExpresion.arbolDeExpresion(expresion);
        
        //System.out.println(arbolExpresion.enOrden() + "=");
        
        //System.out.println(arbolExpresion.preOrden() + "=");
        
        //System.out.println(arbolExpresion.posOrden() + "=");
        
        //System.out.println(ArbolExpresion.evaluar(arbolExpresion));
    }

}
