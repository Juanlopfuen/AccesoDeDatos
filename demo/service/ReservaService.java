package com.example.demo.service;

import com.example.demo.entity.Reserva;
import java.util.List;

@Service
public interface reservaService {

    private ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository ReservaRepository) { this.ReservaRepository = ReservaRepository}


//Insertar
public Reserva insertarReserva( Reserva res){ return ReservaRepository.save(reservaRepository);}
//Listar
public List<Reserva> listarReserva(){ return ReservaRepository.findAll();}
//Actualizar
public Reserva actualizarReserva(Reserva reservaRepository){ return ReservaRepository.save(reservaRepository);}
//Eliminar
public void eliminarReserva(int id){ ReservaRepository.deleteById(id);}

}
