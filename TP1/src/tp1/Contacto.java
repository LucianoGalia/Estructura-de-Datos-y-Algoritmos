/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

import java.util.Objects;

/**
 *
 * @author lucia
 */
public class Contacto {
    private String Nombre;
    private String Telefono;
    private String email;

    public Contacto(String Nombre, String Telefono, String email) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto{" + "Nombre=" + Nombre + ", Telefono=" + Telefono + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.Nombre);
        hash = 89 * hash + Objects.hashCode(this.Telefono);
        hash = 89 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Telefono, other.Telefono)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
