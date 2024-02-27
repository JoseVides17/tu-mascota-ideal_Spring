package vides.tumascotaideal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vides.tumascotaideal.entities.Cuenta;
import vides.tumascotaideal.services.cuenta.CuentaService;

import java.util.List;

@RestController
@RequestMapping("tu-mascota-ideal")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @PostMapping("/cuentas")
    public Cuenta saveCount(@RequestBody Cuenta cuenta){
        return cuentaService.saveCount(cuenta);
    }

    @GetMapping("/cuentas")
    public List<Cuenta> findALlCount(){
        return cuentaService.findAllCount();
    }

    @GetMapping("/cuentas/{id}")
    public Cuenta findById(@PathVariable Long id){
        return cuentaService.findById(id);
    }

    @PutMapping("/cuentas/{id}")
    public Cuenta updateCount(@PathVariable Long id, @RequestBody Cuenta cuentaRecibida){
        Cuenta cuenta = cuentaService.findById(id);
        if(cuenta != null){

        }
        return null;
    }

    @DeleteMapping("/cuentas/{id}")
    public void deleteCount(@PathVariable Long id){
        cuentaService.deleteCount(id);
    }


}
