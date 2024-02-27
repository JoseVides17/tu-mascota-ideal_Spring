package vides.tumascotaideal.services.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vides.tumascotaideal.entities.Persona;
import vides.tumascotaideal.repositories.PersonaRepository;

import java.util.List;

@Service
public class ImplPersonaService implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona savePerson(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> findAllPerson() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePerson(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        if (persona != null)
            personaRepository.delete(persona);
    }
}
