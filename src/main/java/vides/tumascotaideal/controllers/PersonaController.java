package vides.tumascotaideal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vides.tumascotaideal.entities.Persona;
import vides.tumascotaideal.services.persona.PersonaService;

import java.util.List;

@RestController
@RequestMapping("tu-mascota-ideal")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/personas")
    public Persona savePerson(@RequestBody Persona persona){
        return personaService.savePerson(persona);
    }

    @GetMapping("/personas")
    public List<Persona> findALlPerson(){
        return personaService.findAllPerson();
    }

    @GetMapping("/personas/{id}")
    public Persona findById(@PathVariable Long id){
        return personaService.findById(id);
    }

    @PutMapping("/personas/{id}")
    public Persona updatePerson(@PathVariable Long id, @RequestBody Persona personaRecibida){
        Persona persona = personaService.findById(id);
        if(persona != null){

        }
        return null;
    }

    @DeleteMapping("/personas/{id}")
    public void deletePerson(@PathVariable Long id){
        personaService.deletePerson(id);
    }

}
