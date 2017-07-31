/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.interfaces.impl;

import com.cice.interfaces.Interfaz;
import com.cice.interfaces.InterfazSecundaria;

/**
 *
 * @author cice
 */
public class ClaseImplementaInterfaz implements Interfaz{

    @Override
    public String getNombre() {
      return "Nombre";
    }

    @Override
    public String getApellidos() {
        return "Apellidos";
    }

    @Override
    public String nombreCompleto() {
        return getNombre() + " " + getApellidos();
    }

    @Override
    public void nombreMetodo() {
        Interfaz.super.nombreMetodo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void hola(){
        System.out.println("Hola");
    
    }

    @Override
    public void nuevoMetodoAbstracto(String funcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
