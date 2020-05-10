package de.byebyeco2.Services;

import de.byebyeco2.Entities.OpenAreaOffer;
import de.byebyeco2.Entities.OpenAreaSearch;
import de.byebyeco2.Entities.RoofOffer;
import de.byebyeco2.Entities.RoofSearch;

import java.util.List;
import java.util.Optional;

public interface ListingService {

    List<RoofOffer> listAllRoofOffers();

    List<RoofSearch> listAllRoofSearches();

    List<OpenAreaOffer> listAllOpenAreaOffers();

    List<OpenAreaSearch> listAllOpenAreaSearches();

    RoofOffer saveOrUpdateRoofOffer(RoofOffer roofOffer);

    Optional<RoofOffer> getRoofOfferById(Long id);

    void deleteRoofOffer(Long id);
}
