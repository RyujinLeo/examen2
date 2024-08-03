package unah.lenguajes.examen.examen2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.examen.examen2.modelos.Prestamos;
import unah.lenguajes.examen.examen2.repositorios.ClienteRepositorio;
import unah.lenguajes.examen.examen2.repositorios.PrestamosRepositorio;

@SuppressWarnings("unused")
@Service
public class PrestamosServicio {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private PrestamosRepositorio prestamoRepositorio;

}
