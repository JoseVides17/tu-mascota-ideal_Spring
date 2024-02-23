package vides.tumascotaideal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vides.tumascotaideal.entities.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
