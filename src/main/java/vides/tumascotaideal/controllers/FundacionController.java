package vides.tumascotaideal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vides.tumascotaideal.entities.Fundacion;
import vides.tumascotaideal.services.fundacion.FundacionService;

import java.util.List;

@RestController
@RequestMapping("tu-mascota-ideal")
public class FundacionController {

    @Autowired
    private FundacionService fundacionService;

    @PostMapping("/fundaciones")
    public Fundacion saveFundation(@RequestBody Fundacion fundacion){
        return fundacionService.saveFundation(fundacion);
    }

    @GetMapping("/fundaciones")
    public List<Fundacion> findALlFundation(){
        return fundacionService.findAllFundation();
    }

    @GetMapping("/fundaciones/{id}")
    public Fundacion findById(@PathVariable Long id){
        return fundacionService.findById(id);
    }

    @PutMapping("/fundaciones/{id}")
    public Fundacion updateFundation(@PathVariable Long id, @RequestBody Fundacion fundacionRecibida){
        Fundacion fundacion = fundacionService.findById(id);
        if(fundacion != null){

        }
        return null;
    }

    @DeleteMapping("/fundaciones/{id}")
    public void deleteFundation(@PathVariable Long id){
        fundacionService.deleteFundation(id);
    }

}
