/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.poo.pruebas;

import com.cice.interfaces.ICarnet;
import com.cice.poo.dto.AlumnoDTO;
import com.cice.poo.dto.SocioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cice
 */
public class MainCarnet {

    public static void main(String[] args) {

        List<SocioDTO> listaSocios = new ArrayList<>();
        listaSocios.add(new SocioDTO());

        List<AlumnoDTO> listaAlumno = new ArrayList<>();
        listaAlumno.add(new AlumnoDTO());

        List<ICarnet> listaCarnet = new ArrayList<>();
        listaCarnet.add(new SocioDTO());
        listaCarnet.add(new AlumnoDTO());

        for (ICarnet icarnet : listaCarnet) {
            System.out.println(icarnet.getCode());
        }

    }

}
