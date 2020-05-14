package de.byebyeco2.Controller;

import de.byebyeco2.Dtos.RoofOfferDto;
import de.byebyeco2.Entities.*;
import de.byebyeco2.Services.RoofService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class RoofOfferController {

    @Autowired
    private RoofService roofService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * @return: all roofs offers from the repository
     */
    @GetMapping("roofs/allRoofOffers")
    public List<RoofOfferDto> getAllRoofOffers() {
        List<RoofOffer> allroofOffers = new ArrayList<>();
        allroofOffers = roofService.listAllRoofOffers();
        System.out.println(allroofOffers.get(0).toString());
        return allroofOffers.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private RoofOfferDto convertToDto(RoofOffer roofOffer) {
        RoofOfferDto roofOfferDto = modelMapper.map(roofOffer, RoofOfferDto.class);
        return roofOfferDto;
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
