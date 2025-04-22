package com.ccstudent.ccestudianteservice.Controlador;

import com.ccstudent.ccestudianteservice.Entidad.Estudiante;
import com.ccstudent.ccestudianteservice.Servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {
    @Autowired
    EstudianteServicio estudianteServicio;

    @GetMapping
    public ResponseEntity<List<Estudiante>> ListarEstudiante(){
        return new ResponseEntity<>(estudianteServicio.Listar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> BuscarEstudiante(@PathVariable Long id){
        return new ResponseEntity<>(estudianteServicio.Buscar(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity CrearEstudiante(@RequestBody Estudiante estudiante){
        Estudiante nuevoEstudiante = estudianteServicio.Guardar(estudiante);
        return new ResponseEntity<>(nuevoEstudiante, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> ActualizarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante){
        Estudiante estudianteEsta = estudianteServicio.Buscar(id);
        estudiante.setId(id);
        Estudiante estudianteActualizado = estudianteServicio.Actualizar(estudiante);
        return new ResponseEntity<>(estudianteActualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> EliminarEstudiante(@PathVariable Long id){
        Estudiante estudianteEliminado = new Estudiante();
        estudianteEliminado.setId(id);
        estudianteServicio.Eliminar(estudianteEliminado);
        return new ResponseEntity<>(HttpStatus.OK);
}
}




