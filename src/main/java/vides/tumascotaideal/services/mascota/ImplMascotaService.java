package vides.tumascotaideal.services.mascota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vides.tumascotaideal.entities.Mascota;
import vides.tumascotaideal.repositories.MascotaRepository;

import java.util.List;

@Service
public class ImplMascotaService implements MascotaService{

    @Autowired
    private MascotaRepository mascotaRepository;
    @Override
    public Mascota savePet(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public List<Mascota> findAllPet() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota findById(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePet(Long id) {
        Mascota mascota = mascotaRepository.findById(id).orElse(null);
        if (mascota != null)
            mascotaRepository.delete(mascota);
    }
}
