package vides.tumascotaideal.services.mascota;

import vides.tumascotaideal.entities.Mascota;

import java.util.List;

public interface MascotaService {

    public Mascota savePet(Mascota mascota);
    public List<Mascota> findAllPet();
    public Mascota findById(Long id);
    public void deletePet(Long id);

}
