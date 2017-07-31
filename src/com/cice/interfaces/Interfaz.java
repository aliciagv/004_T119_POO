/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.interfaces;

/**
 *
 * @author cice
 * Las interfaces únicamente pueden contener métodos abstractos.Su objetivo es simplemente definir como tiene que ser el formato de determinados métodos que
 * deben existir en determinados tipos de clases.
 */
public interface Interfaz {
    
    public String getNombre();
    
    public String getApelidos();
    
    public String nombreCompleto();
}
