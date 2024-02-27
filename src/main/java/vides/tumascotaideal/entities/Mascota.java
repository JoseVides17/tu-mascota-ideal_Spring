package vides.tumascotaideal.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMascota;
    private String documento;
    private String nombreMascota;
    private String tipoMascota;
    private String raza;
    private Integer edad;
    private String detalles;
    private String ubicacion;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "fundacion_id")
    @JsonManagedReference
    private Fundacion fundacion;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    @JsonIgnore
    private Persona persona;

}
