package de.byebyeco2.Factory;

import de.byebyeco2.Entities.Listing;
import de.byebyeco2.Entities.OpenAreaOffer;
import de.byebyeco2.Entities.OpenAreaSearch;
import de.byebyeco2.Entities.RoofOffer;
import de.byebyeco2.Entities.RoofSearch;
import de.byebyeco2.Services.Types;

import static de.byebyeco2.Services.Types.ListingTypes.offer;
import static de.byebyeco2.Services.Types.ListingTypes.search;
import static de.byebyeco2.Services.Types.RoofTypes.openArea;
import static de.byebyeco2.Services.Types.RoofTypes.roof;


public class RoofOpenAreaMarket extends Marketplace {
    @Override
    protected Listing listingFactory(Types.RoofTypes roofOrArea, Types.ListingTypes listingType) {
        Listing listing = null;

        if (roofOrArea.equals(roof) && listingType.equals(offer)) {
            listing = new RoofOffer();
        } else if (roofOrArea.equals(roof) && listingType.equals(search)) {
            listing = new RoofSearch();
        } else if (roofOrArea.equals(openArea) && listingType.equals(offer)) {
            listing = new OpenAreaOffer();
        } else if (roofOrArea.equals(openArea) && listingType.equals(search)) {
            listing = new OpenAreaSearch();
        } else {

        }
        return listing;
    }
}
