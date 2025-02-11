/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dia2;

/**
 *
 * @author Uniminuto Tibu
 */
public class Carro {
    // atributos ("caracteristicas")
    String marca;
    String modelo;
    int ano;
    String tipoCombustible;
    int caballosFuerza;
    int puertas;
    int asientos;
    int motor;
    int cilindraje;
    String color;
    int cantLlantas;
    
     public Carro(){}
    
    //constructor
    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.caballosFuerza = 140;
        this.puertas = 5;
        this.asientos = 5;
        this.motor = 2800;
        this.color = "negro";
        this.caballosFuerza = 4;
    }
    
    
    
   

    public Carro(String marca, String modelo, int ano, String tipoCombustible, int caballosFuerza, int puertas, int asientos, int motor, int cilindraje, String color, int cantLlantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustible = tipoCombustible;
        this.caballosFuerza = caballosFuerza;
        this.puertas = puertas;
        this.asientos = asientos;
        this.motor = motor;
        this.cilindraje = cilindraje;
        this.color = color;
        this.cantLlantas = cantLlantas;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", tipoCombustible=" + tipoCombustible + ", caballosFuerza=" + caballosFuerza + ", puertas=" + puertas + ", asientos=" + asientos + ", motor=" + motor + ", cilindraje=" + cilindraje + ", color=" + color + ", cantLlantas=" + cantLlantas + '}';
    }
    
}

