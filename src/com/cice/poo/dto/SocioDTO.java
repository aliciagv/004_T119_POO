/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.poo.dto;

import com.cice.interfaces.ICarnet;

/**
 *
 * @author cice
 */
public class SocioDTO implements ICarnet {

   
    public String getTipo(){
        return "Socio";
    }
    @Override
    public String getCode() {
       return "SocioCode";
    }

    @Override
    public String getAlias() {
        return "SocioAlias";
    }
    
    
}
