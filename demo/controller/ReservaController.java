package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }
   

  // Devolver todas las reserva
  // Devolver un reserva 
  // añadir reserva -- no se debe repetir
  @PostMapping
  public reserva insertar(@RequestBody Reserva reservaService) {
        return service.insertarReserva(reservaService);
    }

  // modificar reserva

@PutMapping
    public reserva actualizar(@RequestBody Reserva reservaService) {
        return service.actualizarReserva(reservaService);
    }

  // borrar reserva
  @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminarReserva(id);
    }
}
