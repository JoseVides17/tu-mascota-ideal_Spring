package vides.tumascotaideal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vides.tumascotaideal.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
