package de.byebyeco2.Controller;

import de.byebyeco2.Dtos.RoofOfferDto;
import de.byebyeco2.Entities.*;
import de.byebyeco2.Services.RoofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class RoofOfferController {

    @Autowired
    private RoofService roofService;

    /**
     * @return: all roofs offers from the repository
     */
    @GetMapping("roofs/offers/getAllRoofs")
    public List<RoofOffer> getAllRoofOffers() {
        return roofService.listAllRoofOffers();
    }

    /**
     * Get's an example as JSON from the angular-client and saves it as a new example into the repository
     *
     * @return: boolean if successful
     */
    @PostMapping("roofs/saveRoof")
    public Boolean saveRoof(@RequestBody RoofOfferDto roofOfferDto) {
        roofService.saveOrUpdateRoofOffer(new RoofOffer(roofOfferDto.getTitle(), roofOfferDto.getSize(), roofOfferDto.getRoofType()));
        return true; //TODO: make it return something useful
    }

}
