package de.byebyeco2.Services;

import de.byebyeco2.Entities.Roof;
import de.byebyeco2.Repositories.RoofRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoofService {

    @Autowired
    private RoofRepository roofRepository;

    public List<Roof> listRoofs() {
        return roofRepository.findAll();
    }

    /**
     * saves the provided roof to the database
     */
    public void saveRoof(Roof roof) {
        roofRepository.save(roof);
    }

}
