package unah.lenguajes.examen.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.examen.examen2.modelos.Cliente;
import unah.lenguajes.examen.examen2.servicios.ClienteServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/obtener/todos")
    public List<Cliente> obtenerTodos() {
        return this.clienteServicio.obtenerTodos();
    }


    @PostMapping("/crear/nuevo")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente) {        
        if(!this.clienteServicio.buscarPorIdentidad(nvoCliente.getDni())){
            return this.clienteServicio.crearCliente(nvoCliente);
        }
        return null;
        
    }
    
    
    
}
