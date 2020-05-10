package de.byebyeco2.Controller;

import de.byebyeco2.Dtos.RoofOfferDto;
import de.byebyeco2.Entities.*;
import de.byebyeco2.Factory.Marketplace;
import de.byebyeco2.Factory.RoofOpenAreaMarket;
import de.byebyeco2.Services.ListingServiceImpl;
import de.byebyeco2.Services.Types;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@CrossOrigin
public class ListingController {

    @Autowired
    private ListingServiceImpl listingServiceImpl;
    private Marketplace market = new RoofOpenAreaMarket();

    @PostConstruct
    public void createBaseDataset() {
        // places
        RoofOffer roof = new RoofOffer();
        roof.setOrientation(1);
        roof.setRoofTilt(2);
        roof.setRoofType(3);
        listingServiceImpl.saveOrUpdateRoofOffer(roof);
    }

    /**
     * @return: all roofs offers from the repository
     */
    @GetMapping("roofs/offers/getAllRoofs")
    public List<RoofOffer> getAllRoofOffers() {
        return listingServiceImpl.listAllRoofOffers();
    }

    /**
     * @return: all roof searches from the repository
     */
    @GetMapping("roofs/searches/getAllRoofs")
    public List<RoofSearch> getAllRoofSearches() {
        return listingServiceImpl.listAllRoofSearches();
    }

    /**
     * @return: all openAreas from the repository
     */
    @GetMapping("openArea/offers/getAllOpenAreas")
    public List<OpenAreaOffer> getAllOpenAreaOffers() {
        return listingServiceImpl.listAllOpenAreaOffers();
    }

    /**
     * @return: all openAreas from the repository
     */
    @GetMapping("openArea/searches/getAllOpenAreas")
    public List<OpenAreaSearch> getAllOpenAreaSearches() {
        return listingServiceImpl.listAllOpenAreaSearches();
    }


    /**
     * Get's an example as JSON from the angular-client and saves it as a new example into the repository
     *
     * @return: boolean if successful
     */
    @PostMapping("roofs/saveRoof")
    public Boolean saveRoof(@RequestBody RoofOfferDto roofOfferDto) {
        Listing roofOffer = market.manageListing(Types.RoofTypes.roof, Types.ListingTypes.offer);
        listingServiceImpl.saveOrUpdateRoofOffer(new RoofOffer(roofOfferDto.getOrientation(), roofOfferDto.getRoofTilt(), roofOfferDto.getRoofType()));
        return true;
    }

}
