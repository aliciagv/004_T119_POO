/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.poo.dto;

/**
 *
 * @author cice
 */
public class Coche extends Vehiculo{
    
    //atributos privados
    private int idcoche;
    private String color;
    private String matricula;

    public Coche() {
        super();
             
    }
  
   /* public Coche(int numeroRuedas, String bastidor, String matricula) {
        super(numeroRuedas, bastidor);
        this.matricula=matricula;
    }*/
  
 
    @Override
    public void encender(){
        System.out.println("Encendiendo el coche");
    
    }
    /**
     * Método get del atributo idcoche
     * @return entero idCoche
     */
    public int getIdcoche() {
        return idcoche;
    }

    /**
     *
     * @param idcoche
     */
    public void setIdcoche(int idcoche) {
        this.idcoche = idcoche;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
