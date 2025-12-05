package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aula")

public class AulaController {

    private final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

  // Devolver todas las aulas

  // Devolver un aula 

  // añadir aula -- no se debe repetir
@PostMapping
    public Aula insertar(@RequestBody AulaService aulaService) {
        return service.insertarAula(aulaService);
    }

  // modificar aula
  @PutMapping
   public Aula actualizar(@RequestBody AulaService aulaService ) {
        return service.actualizar
  // borrar aula
@DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminarAula(id);
    }
}
}


