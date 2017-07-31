/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.poo.pruebas;


import com.cice.poo.abstractas.Abstracta;
import com.cice.poo.dto.Coche;
import com.cice.poo.dto.Moto;


/**
 *
 * @author cice
 */
public class Main {
    public static void main(String[] args){
        
       // Coche coche1 =new Coche(5,"BASTIDOR","1111BCB");
        Coche coche2 =new Coche();
        coche2.encender();
        
        Moto moto =new Moto(2,"BASTIDOR2");
        
       // Vehiculo vehiculo =new Vehiculo();
       
       Abstracta abs = new Abstracta() {
            @Override
            public String nombreCompleto() {
               return "default";
            }
        };
               
       
    
    }
    
}
