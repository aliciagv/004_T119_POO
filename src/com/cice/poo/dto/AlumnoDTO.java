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
public class AlumnoDTO implements ICarnet{

    
    public String getCurso(){
        return "Curso";
    }
    @Override
    public String getCode() {
       return "AlumnoCode";
    }

    @Override
    public String getAlias() {
        return "AlumnoAlias";
    }
    
}
