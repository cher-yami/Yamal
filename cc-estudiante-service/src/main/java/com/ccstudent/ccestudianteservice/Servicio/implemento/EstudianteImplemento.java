package com.ccstudent.ccestudianteservice.Servicio.implemento;

import com.ccstudent.ccestudianteservice.Entidad.Estudiante;
import com.ccstudent.ccestudianteservice.Repositorio.EstudianteRepositorio;
import com.ccstudent.ccestudianteservice.Servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteImplemento implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> Listar(){
        return estudianteRepositorio.findAll();
    }

    @Override
    public Estudiante Buscar(Long id) {
        return estudianteRepositorio.findById(id).get();
    }

    @Override
    public Estudiante Guardar(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
        return estudiante;
    }

    @Override
    public Estudiante Actualizar(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
        return estudiante;
    }
    @Override
    public Estudiante Eliminar(Estudiante estudiante) {
        estudianteRepositorio.delete(estudiante);
        return estudiante;
}
}