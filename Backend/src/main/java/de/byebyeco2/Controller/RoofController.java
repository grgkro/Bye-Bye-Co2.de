package de.byebyeco2.Controller;

import de.byebyeco2.Dtos.RoofDto;
import de.byebyeco2.Entities.ExampleCalculator;
import de.byebyeco2.Entities.Roof;
import de.byebyeco2.Services.ExampleCalculatorService;
import de.byebyeco2.Services.RoofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RoofController {

    @Autowired
    private RoofService roofService;

    /**
     * @return: all roofs from the repository
     */
    @GetMapping("roofs/getAllRoofs")
    public List<Roof> getAllRoofs() {
        return roofService.listRoofs();
    }

    /**
     * Get's an example as JSON from the angular-client and saves it as a new example into the repository
     *
     * @return: boolean if successful
     */
    @PostMapping("roofs/saveRoof")
    public Boolean saveRoof(@RequestBody Roof roof) {
        roofService.saveRoof(roof);
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm");
        // TODO: replace LocalDateTime.now() in the new Group with the actual formatted timestamps from the GroupDto


        return true;
    }

}
