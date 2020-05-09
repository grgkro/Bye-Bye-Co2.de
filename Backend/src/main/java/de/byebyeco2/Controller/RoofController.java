package de.byebyeco2.Controller;

import de.byebyeco2.Dtos.RoofDto;
import de.byebyeco2.Entities.Roof;
import de.byebyeco2.Services.RoofServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@CrossOrigin
public class RoofController {

    @Autowired
    private RoofServiceImpl roofServiceImpl;

    @PostConstruct
    public void createBaseDataset() {
        // places
        Roof roof = new Roof();
        roof.setOrientation(1);
        roof.setRoofTilt(2);
        roof.setRoofType(3);
        roofServiceImpl.saveRoof(roof);
    }


        /**
         * @return: all roofs from the repository
         */
    @GetMapping("roofs/getAllRoofs")
    public List<Roof> getAllRoofs() {
        return roofServiceImpl.listAll();
    }

    /**
     * Get's an example as JSON from the angular-client and saves it as a new example into the repository
     *
     * @return: boolean if successful
     */
    @PostMapping("roofs/saveRoof")
    public Boolean saveRoof(@RequestBody RoofDto roofDto) {
        roofServiceImpl.saveRoof(new Roof(roofDto.getOrientation(), roofDto.getRoofTilt(), roofDto.getRoofType()));
        return true;
    }

}
