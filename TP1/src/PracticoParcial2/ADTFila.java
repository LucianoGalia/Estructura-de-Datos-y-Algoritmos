/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticoParcial2;

/**
 *
 * @author lucia
 */
public class ADTFila {

    public static  Fila concatADT(Fila f1, Fila f2) {
        Fila copia1 = f1.copiar(); // no modificar las originales
        Fila copia2 = f2.copiar();
        Fila resultado = Fila.filaVacia(); // crear nueva fila

        // Recorrer la primera fila
        while (!copia1.esFilaVacia()) {
            Object x = copia1.Frente();      // obtener frente
            resultado.enFila(x);        // agregar al resultado
            copia1 = copia1.deFila();   // eliminar frente
        }

        // Recorrer la segunda fila
        while (!copia2.esFilaVacia()) {
            Object x = copia2.Frente();
            resultado.enFila(x);
            copia2 = copia2.deFila();
        }

        return resultado;
    }
    

}
