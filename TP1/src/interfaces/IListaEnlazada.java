/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import tp1.ListaEnlazada;



/**
 *
 * @author lucia
 */
public interface IListaEnlazada {
    public boolean esVacia();   //Comprueba si la lista está vacía
    public ListaEnlazada insertarAlInicio(int x);   //Inserta un nodo al comienzo de la lista
    public ListaEnlazada insertarAlFinal(int x);    //Inserta un nodo al final de la lista
    public void mostrar();      //Recorre los nodos de la Lista y muestra su contenido por pantalla
    public int cantidad();      //Devuelve la cantidad de nodos de la lista.
    public int primerElemento();     //Devuelve el primer elemento de la lista
    public ListaEnlazada borrarPrimero();   //Elimina el primer nodo de la lista
    public ListaEnlazada borrarUltimo();    //Elimina el último nodo de la lista
    public boolean pertenece(int buscado);  //Determina si un elemento pertenece a la lista
    public ListaEnlazada borrarConValor(int buscado); //Elimina todos los nodos que contengan el valor igual a x
    public int valorEnPosicion(int posicion);   //Devuelve el contenido del nodo en la posición posicion
    public ListaEnlazada modificarValorEnPosicion(int valor, int posicion); //Modificar el contenido del nodo de la posición posicion
    public ListaEnlazada insertarEnPosicion(int valor, int posicion); //Inserta un nodo en la posición posición con valor valor

    
}
