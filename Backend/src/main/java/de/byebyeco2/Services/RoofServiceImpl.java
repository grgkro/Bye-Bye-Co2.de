package de.byebyeco2.Services;

import de.byebyeco2.Entities.RentalObject;
import de.byebyeco2.Entities.Roof;
import de.byebyeco2.Repositories.RoofRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoofServiceImpl implements RentalObjectService {

    @Autowired
    private RoofRepository roofRepository;

    /**
     * saves the provided roof to the database
     */
    public void saveRoof(Roof roof) {
        roofRepository.save(roof);
    }

    @Override
    public List<Roof> listAll() {
        List<Roof> roofs = new ArrayList<>();
        roofRepository.findAll().forEach(roofs::add);
        return null;
    }

    @Override
    public RentalObject getById(Long id) {

        return null;
    }


    @Override
    public RentalObject saveOrUpdate(RentalObject rentalObject) {
        Roof roof = new Roof();
        roofRepository.save(roof);
        return roof;
    }

    @Override
    public void delete(Long id) {
        roofRepository.deleteById(id);
    }
}
