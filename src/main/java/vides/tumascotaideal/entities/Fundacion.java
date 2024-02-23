package vides.tumascotaideal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fundacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFundacion;
    private Integer nit;
    private String nombreFundacion;
    private String departamento;
    private String ciudad;
    private String tipo;
    private Boolean estado;
    private String ubicacion;
    @JsonBackReference
    @OneToMany(mappedBy = "fundacion", cascade = CascadeType.ALL)
    private List<Mascota> mascotas = new ArrayList<>();
    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "cuenta_id", unique = true)
    private Cuenta cuenta;

}
