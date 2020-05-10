package de.byebyeco2.Factory;

import de.byebyeco2.Entities.Listing;
import de.byebyeco2.Services.Types;

public abstract class Marketplace {
    protected abstract Listing listingFactory(Types.RoofTypes roofOrArea, Types.ListingTypes listingType);

    public Listing manageListing(Types.RoofTypes roofOrArea, Types.ListingTypes listingType) {
        Listing listing = listingFactory(roofOrArea, listingType);
        return listing;
    }
}
