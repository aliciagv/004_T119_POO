/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.poo.dto;

import com.cice.poo.abstractas.Abstracta;

/**
 *
 * @author cice
 * Una clase que hereda de una clase abstracta tiene la obligación de implementar todos los métodos abstractos del padre, salvo que se declare como abstracta.
 */
public  class Persona extends Abstracta {

    @Override
    public String nombreCompleto() {
       return this.getNombre()+" "+ this.getApellidos();
    }
    
}
