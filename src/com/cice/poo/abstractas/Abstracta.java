/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.poo.abstractas;

/**
 *
 * @author cice
 * Clase abstracta debe tener al menos un método abstracto
 * método abstracto: que no tiene definición, está declarado pero no definido 
 * Palabra reservada abstract, tanto en la definición de la clase como en el método.
 * No se pueden crear objetos de esta clase. Sirven de base a futuras clases que al heredarla sobrescribirán los métodos abstractos definidos en ella para
 *  proporcionarles una funcionalidad .
 */
public abstract class Abstracta {
    
    private String nombre;
    private String apellidos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public abstract String nombreCompleto();
   
    
}
