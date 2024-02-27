package vides.tumascotaideal.services.cuenta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vides.tumascotaideal.entities.Cuenta;
import vides.tumascotaideal.repositories.CuentaRepository;

import java.util.List;

@Service
public class ImplCuentaService implements CuentaService{

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public Cuenta saveCount(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    @Override
    public List<Cuenta> findAllCount() {
        return cuentaRepository.findAll();
    }

    @Override
    public Cuenta findById(Long id) {
        return cuentaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCount(Long id) {
        Cuenta cuenta = cuentaRepository.findById(id).orElse(null);
        if (cuenta != null)
            cuentaRepository.delete(cuenta);
    }
}
