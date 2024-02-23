package vides.tumascotaideal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vides.tumascotaideal.entities.Fundacion;

@Repository
public interface FundacionRepository extends JpaRepository<Fundacion, Long> {
}
