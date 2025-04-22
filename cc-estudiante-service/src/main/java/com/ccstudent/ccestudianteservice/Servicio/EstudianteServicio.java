package com.ccstudent.ccestudianteservice.Servicio;

import com.ccstudent.ccestudianteservice.Entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {

    List<Estudiante> Listar();

    Estudiante Buscar(Long id);


    Estudiante Guardar(Estudiante insidencia);


    Estudiante Actualizar(Estudiante insidencia);


    Estudiante Eliminar(Estudiante insidencia);
}
