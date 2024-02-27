package vides.tumascotaideal.services.persona;

import vides.tumascotaideal.entities.Persona;

import java.util.List;

public interface PersonaService {

    public Persona savePerson(Persona persona);
    public List<Persona> findAllPerson();
    public Persona findById(Long id);
    public void deletePerson(Long id);

}
