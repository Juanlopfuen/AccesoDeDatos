package com.example.demo.repository;

import com.example.demo.entity.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
//Error de Aulass a Aula
// y en vez de Srting Long
public interface AulaRepository extends JpaRepository<Aula, Long> {

}
