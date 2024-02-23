package vides.tumascotaideal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vides.tumascotaideal.entities.Mascota;
import vides.tumascotaideal.services.mascota.MascotaService;

import java.util.List;

@RestController
@RequestMapping("tu-mascota-ideal")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @PostMapping("/mascotas")
    public Mascota savePet(@RequestBody Mascota mascota){
        return mascotaService.savePet(mascota);
    }

    @GetMapping("/mascotas")
    public List<Mascota> findALlPet(){
        return mascotaService.findAllPet();
    }

    @GetMapping("/mascotas/{id}")
    public Mascota findById(@PathVariable Long id){
        return mascotaService.findById(id);
    }

    @PutMapping("/mascotas/{id}")
    public Mascota updatePet(@PathVariable Long id, @RequestBody Mascota mascotaRecibida){
        Mascota mascota = mascotaService.findById(id);
        if(mascota != null){

        }
        return null;
    }

    @DeleteMapping("/mascotas/{id}")
    public void deletePet(@PathVariable Long id){
        mascotaService.deletePet(id);
    }

}
