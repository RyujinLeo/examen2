package unah.lenguajes.examen.examen2.modelos;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="prestamos")
@Data
public class Prestamos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codioprestamo")
    private long codigoPrestamo;

    @Column(name="fechaapertura")
    private LocalDate fechaApertura;

    private double monto;

    @OneToMany(mappedBy = "prestamos", cascade = CascadeType.ALL)
    private List<Cuotas> cuotas;

    private double saldo;

    private int plazo;

    @JsonIgnore
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;
}


