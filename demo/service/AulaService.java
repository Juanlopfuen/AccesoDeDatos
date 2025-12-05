package com.example.demo.service;

import com.example.demo.entity.Aula;
import java.util.List;

@Service
public interface AulaService {

    private Aula AulaRepository;

    public AulaService(AulaRepository AulaRepository) { this.AulaRepository = AulaRepository}

// Recoger todas las reservas.
// recoger una reserva.
// Guardar una reserva --Se debe validar horas
// Cambiar una reserva.
// Borrar una reserva.

//Insertar
public Aula insertarReserva( Reserva AulaRepository){ return AulaRepository.save(AulaRepository);}
//Listar
public List<Reserva> listarReserva(){ return AulaRepository.findAll();}
//Actualizar
public Reserva actualizarReserva(Reserva AulaRepository){ return AulaRepository.save(AulaRepository);}
//Eliminar
public void eliminarReserva(int id){ AulaRepository.deleteById(id);}

}
