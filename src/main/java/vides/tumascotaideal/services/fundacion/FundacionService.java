package vides.tumascotaideal.services.fundacion;

import vides.tumascotaideal.entities.Fundacion;

import java.util.List;

public interface FundacionService {

    public Fundacion saveFundation(Fundacion fundacion);
    public List<Fundacion> findAllFundation();
    public Fundacion findById(Long id);
    public void deleteFundation(Long id);

}
