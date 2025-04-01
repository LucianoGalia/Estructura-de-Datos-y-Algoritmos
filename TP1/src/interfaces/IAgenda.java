/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import tp1.Agenda;
import tp1.Contacto;
import tp1.ListaEnContactos;
import tp1.ListaEnlazada;

/**
 *
 * @author lucia
 */
public interface IAgenda {
    public Agenda agregar(Contacto c); //Agrega un contacto a la agenda
    public Contacto buscar(String nombre); //Buscar el primer contacto con el nombre recibido por parámetro y devuelve el
                                           //Contacto. Si no existe devuelve NULL
    public ListaEnContactos borrar(String telefono); //Elimina el primer contacto con telefono igual al recibido por parámetro
    public void listar(); //Muestra por pantalla los datos de todos los contactos de la agenda
    public int cantidad(); //Devuelve la cantidad de contactos en la agenda
    public Contacto enPosicion(int posicion); //Devuelve el contacto en la posición posicion
}
