package vides.tumascotaideal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private Long identificacion;
    private String lugarExpedicion;
    private LocalDate fechaExpedicion;
    private LocalDate fechaNacimiento;
    private String nombres;
    private String apellidos;
    private String ciudadResidencia;
    private String departamentoResidencia;
    private String ubicacion;
    private Boolean estado;
    @JsonIgnore
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Mascota> mascotas = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "cuenta_id", unique = true)
    @JsonBackReference
    private Cuenta cuenta;

}
