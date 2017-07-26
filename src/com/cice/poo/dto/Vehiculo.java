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
public class Vehiculo {
    
    //atributos de la clase vehículo
    private int numeroRuedas;
    private String bastidor;

    
    protected Vehiculo(int numeroRuedas,String bastidor){
        this.numeroRuedas=numeroRuedas;
        this.bastidor=bastidor;
    }
    
    public Vehiculo(int numeroRuedas){
        this.numeroRuedas=numeroRuedas;
    }
    public Vehiculo(){
    
    }
  
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    
    
    protected void encender(){
        System.out.println("Encendiendo motores");
    
    }
    
    protected void apagar(){
        System.out.println("Apagando motores");
    }
    
    
    
}
