package de.byebyeco2.Services;

import de.byebyeco2.Entities.*;
import de.byebyeco2.Repositories.OpenAreaOfferRepository;
import de.byebyeco2.Repositories.OpenAreaSearchRepository;
import de.byebyeco2.Repositories.RoofOfferRepository;
import de.byebyeco2.Repositories.RoofSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ListingServiceImpl implements ListingService {

    @Autowired
    private RoofOfferRepository roofOfferRepository;

    @Autowired
    private RoofSearchRepository roofSearchRepository;

    @Autowired
    private OpenAreaOfferRepository openAreaOfferRepository;

    @Autowired
    private OpenAreaSearchRepository openAreaSearchRepository;

    @Override
    public RoofOffer saveOrUpdateRoofOffer(RoofOffer roofOffer) {
        roofOfferRepository.save(roofOffer);
        return roofOffer;
    }

    @Override
    public Optional<RoofOffer> getRoofOfferById(Long id) {
        return roofOfferRepository.findById(id);
    }

    @Override
    public void deleteRoofOffer(Long id) {
        roofOfferRepository.deleteById(id);
    }

    @Override
    public List<RoofOffer> listAllRoofOffers() {
        List<RoofOffer> roofs = new ArrayList<>();
        roofOfferRepository.findAll().forEach(roofs::add);
        return roofs;
    }

    @Override
    public List<RoofSearch> listAllRoofSearches() {
        List<RoofSearch> roofs = new ArrayList<>();
        roofSearchRepository.findAll().forEach(roofs::add);
        return roofs;
    }

    @Override
    public List<OpenAreaOffer> listAllOpenAreaOffers() {
        List<OpenAreaOffer> areas = new ArrayList<>();
        openAreaOfferRepository.findAll().forEach(areas::add);
        return areas;
    }

    @Override
    public List<OpenAreaSearch> listAllOpenAreaSearches() {
        List<OpenAreaSearch> areas = new ArrayList<>();
        openAreaSearchRepository.findAll().forEach(areas::add);
        return areas;
    }
}
