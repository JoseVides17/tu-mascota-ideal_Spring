package vides.tumascotaideal.services.cuenta;

import vides.tumascotaideal.entities.Cuenta;

import java.util.List;

public interface CuentaService {

    public Cuenta saveCount(Cuenta cuenta);
    public List<Cuenta> findAllCount();
    public Cuenta findById(Long id);
    public void deleteCount(Long id);

}
