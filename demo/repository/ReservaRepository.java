package com.example.demo.repository;

import com.example.demo.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
//Error de Reserve a Reserva
// y en vez de boolean Long
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
   
}
