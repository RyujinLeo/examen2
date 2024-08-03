package unah.lenguajes.examen.examen2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.examen.examen2.modelos.Cliente;
import unah.lenguajes.examen.examen2.modelos.Cuotas;
import unah.lenguajes.examen.examen2.modelos.Prestamos;

import unah.lenguajes.examen.examen2.repositorios.ClienteRepositorio;
import unah.lenguajes.examen.examen2.repositorios.PrestamosRepositorio;
import unah.lenguajes.examen.examen2.repositorios.CuotasRepositorio;

@Service
public class ClienteServicio {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    

    public List<Cliente> obtenerTodos(){
        return this.clienteRepositorio.findAll();
    }

    public Cliente crearCliente(Cliente nvoCliente){

    
        List<Prestamos> prestamos = nvoCliente.getPrestamos();        
        if(prestamos!=null){
            for(Prestamos producto : prestamos){
                producto.setCliente(nvoCliente);
            }
        }

        return this.clienteRepositorio.save(nvoCliente);
     
        
    }



    public boolean buscarPorIdentidad(String identidad){
        return this.clienteRepositorio.existsById(identidad);
    }
}
