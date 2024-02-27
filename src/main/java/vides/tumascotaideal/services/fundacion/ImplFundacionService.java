package vides.tumascotaideal.services.fundacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vides.tumascotaideal.entities.Fundacion;
import vides.tumascotaideal.repositories.FundacionRepository;

import java.util.List;

@Service
public class ImplFundacionService implements FundacionService{

    @Autowired
    private FundacionRepository fundacionRepository;

    @Override
    public Fundacion saveFundation(Fundacion fundacion) {
        return fundacionRepository.save(fundacion);
    }

    @Override
    public List<Fundacion> findAllFundation() {
        return fundacionRepository.findAll();
    }

    @Override
    public Fundacion findById(Long id) {
        return fundacionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteFundation(Long id) {
        Fundacion fundacion = fundacionRepository.findById(id).orElse(null);
        if (fundacion != null)
            fundacionRepository.delete(fundacion);
    }
}
