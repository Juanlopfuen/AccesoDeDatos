package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // añadir mínimo 3 atributos (ejemplo: fecha, horaInicio, horaFin, aulaId)
    // TODO: constructor con parámetros

    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String aulaId;
//Constructor Vacio
    public Reserva(){

    }
//Conatructor con Parametros
 public Reserva (Long id, LocalDate fecha, LocalTime horaInicio, LocalDate horaFin, String aulaId){

    this.id = id;
    this.fecha = fecha;
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
    this.aulaId = aulaId;
  }
  //Getter y Setters
 private Long getId(){return id;}
    private Void setId(Long id){this.id = id;}

  private LocalDate getfecha(){return fecha;}
    private Void setFecha(LocalDate fecha){this.fecha = fecha;}
        
  private LocalTime getHoraInicio(){return horaInicio;}
    private Void setHoraInico(LocalTime horaInicio){this.horaInicio = horaInicio;}

 private LocalTime getHoraFin(){return horaFin;}
    private Void setHoraFin(LocalTime horaFin){this.horaFin = horaFin;}

 private String getAulaId(){return aulaId;}
    private Void setAulaId(String aulaId){this.aulaId = aulaId;}

@Override 
public String toString() {
    return "fecha: " fecha + "Hora Inicio: " horaInicio + "Hora Fin: " horaFin + "Aula: " aulaId;
}

}
