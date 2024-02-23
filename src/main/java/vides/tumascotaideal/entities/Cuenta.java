package vides.tumascotaideal.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroCuenta;
    private String username;
    private String password;
    private LocalDate fechaCreacion;
    private Boolean estado;
    @OneToOne(mappedBy = "cuenta")
    @JsonIgnore
    private Persona persona;

    @OneToOne(mappedBy = "cuenta")
    @JsonIgnore
    private Fundacion fundacion;

}
