/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author lucia
 */
public class RedSocial {
    private Nodo primero;
    private Nodo ultimo;
    private int cantidad;

    public RedSocial() {
        this.primero = null;
        this.ultimo = null;
        this.cantidad = 0;
    }
    
    public static RedSocial Crear(){
        return new RedSocial();
    }
    
    public RedSocial registrar(Usuario usuario) { //actualiza la red social con un nuevo usuario agregado
    Nodo aux = new Nodo(usuario);
    
    if (this.primero == null) { //si el primero en la lista es vacia, entonces:
        this.ultimo = aux;      // Actualiza la cola si la lista estaba vacía
    } //sino
    
    aux.setSiguiente(this.primero);  // El nuevo nodo apunta al antiguo primero (asignar)
    this.primero = aux;             // El nuevo nodo pasa a ser el primero (apuntar)
    this.cantidad++;                // Incrementa el contador
    return this;                    // Retorna la red social actualizada
}
    
    public boolean esVacia() {
        return primero == null;
    }
    
    public Usuario ultimoUsuario() {
        if (this.primero == null) {
            return null;
        }
        
        return this.primero.getUsuario();
    }
    
    // Operación CANTIDAD
    public int cantidad() {
        return this.cantidad;
    }
    
    /*b) Implemente en Java el ADT REDSOCIAL(USUARIOS) usando lista
    simplemente enlazada. USUARIO debe contener los atributos nombre,
    apellido. La implementación de la operación ESTA debe ser recursiva.
    */
    
    
    public Boolean ESTA(Usuario usuario){ //verifica si el usuario ESTA en la RedSocial
        return estaRec(this.primero, usuario); //llamo a la funcion privada recursiva
    }
    //funcion privada recursiva de ESTA
    private Boolean estaRec(Nodo aux,Usuario usuario){
        //Hago 2 casos bases
        if(aux == null){    //si llego al final de la lista, retorno falso
            return false;
        }
        
        if(aux.getUsuario().equals(usuario)){ //si el usuario buscado get.Usuario() = "usuario" de la lista
            return true;                      //retorno verdadero
        }
        
        return estaRec(aux.getSiguiente(), usuario);
    }
    
    public RedSocial echar(Usuario usuario) { //Elimina un usuario de la lista(RedSocial)
    Nodo actual = this.primero;  // Puntero para recorrer la lista
    Nodo anterior = null;        // Puntero al nodo previo a 'actual'

    while (actual != null) {     // Recorre la lista hasta el final
        if (actual.getUsuario().equals(usuario)) {  // Si encuentra al usuario
            // --- Caso 1: Eliminar el primer nodo ---
            if (anterior == null) {  
                this.primero = actual.getSiguiente();  // Actualiza 'primero' al siguiente nodo
                if (this.primero == null) {  
                    this.ultimo = null;  // Si la lista queda vacía, actualiza "la cola del nodo"
                }
                actual = this.primero;  // Avanza 'actual' al nuevo primer nodo ("debido a getSiguiente()")
                
            } else {// --- Caso 2: Eliminar nodo intermedio o final ---
                anterior.setSiguiente(actual.getSiguiente());  // "Salta" el nodo a eliminar
                
                if (actual == this.ultimo) {  
                    this.ultimo = anterior;  // Si se elimina el último nodo, actualiza 'cola'
                }
                
                actual = actual.getSiguiente();  // Avanza 'actual' al siguiente nodo
            }
            
            this.cantidad--;  // Decrementa el contador de nodos
            
        } else { // --- Si no se encontró el usuario en 'actual' ---
            anterior = actual;          // 'anterior' sigue a 'actual'
            actual = actual.getSiguiente();  // Avanza 'actual'
        }
    }
    
    return this;  // Retorna la instancia para encadenamiento (Fluent API)
}
    
    
    
    /*c) Como usuario del ADT REDSOCIAL escriba una Función UNION que dadas
    2 REDESSOCIALES le devuelva otra REDSOCIAL, armada con todos los
    ítems de las dos redes dadas.
    */
    
    public static RedSocial union(RedSocial r1, RedSocial r2) {
        RedSocial resultado = new RedSocial();
        agregarUsuarios(r1.primero, resultado);
        agregarUsuarios(r2.primero, resultado);
        return resultado;
    }

    private static void agregarUsuarios(Nodo actual, RedSocial resultado) {
        if (actual != null) {
            if (!resultado.ESTA(actual.usuario)) { // Evita duplicados
                resultado.registrar(actual.usuario);
            }
            agregarUsuarios(actual.siguiente, resultado); // Recorre la lista
        }
    }
    
    
    
    
    private class Nodo {
        private Nodo siguiente;
        private Usuario usuario;

        public Nodo(Usuario usuario) {
            this.siguiente = null;
            this.usuario = usuario;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }
    }
    
    
}
