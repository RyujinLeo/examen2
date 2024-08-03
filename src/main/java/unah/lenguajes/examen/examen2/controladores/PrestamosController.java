package unah.lenguajes.examen.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.examen.examen2.modelos.Prestamos;
import unah.lenguajes.examen.examen2.servicios.PrestamosServicio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/producto")
public class PrestamosController {
    
    @Autowired
    private PrestamosServicio prestamosServicio;

    @PostMapping("/asociar/{dni}")
    public Prestamos postMethodName(@PathVariable(name="dni") String dni,
                                 @RequestBody Prestamos prestamo) {
        return this.prestamosServicio.crearPrestramo(dni, prestamo);
    }
    
    @DeleteMapping("/eliminar/{dni}/{producto}")
    public String eliminarProducto(@PathVariable(name="dni") String dni,
                                   @PathVariable(name="producto") long producto){
        return this.prestamosServicio.eliminarPrestamo(dni, producto);
    }

}
