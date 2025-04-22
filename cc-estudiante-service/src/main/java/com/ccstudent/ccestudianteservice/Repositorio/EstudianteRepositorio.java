package com.ccstudent.ccestudianteservice.Repositorio;

import com.ccstudent.ccestudianteservice.Entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}
