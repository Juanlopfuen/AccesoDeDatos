package com.example.demo.entity;

import jakarta.persistence.*;


public class Aula {

    private Long id;

    // añadir mínimo 3 atributos (ejemplo: nombre, capacidad, edificio)
   private String nombre;
   private int capacidad;
   private String edificio;
    //Constructor Vacio
    public Aula(){

    }
    //Constructor con parametros
  public Aula(Long id, String nombre, int capacidad, String edificio){

    this.id =id;
    this.nombre = nombre;
    this.capacidad = capacidad;
    this.edificio = edificio;
  }
 private Long getId(){return id;}
    private Void setId(Long id){this.id = id;}

  private String getNombre(){return nombre;}
    private Void setNombre(String nombre){this.nombre = nombre;}
        
  private int getCapacidad(){return capacidad;}
    private Void setCapacidad(int capacidad){this.capacidad = capacidad;}

 private String getEdificio(){return edificio;}
    private Void setEdificio(String edificio){this.edificio = edificio;}

@Override
String toString(){
    return "ID: " id + "Nombre: " nombre + "Capacidad: " capacidad + "Edificio: " edificio;
}

}
