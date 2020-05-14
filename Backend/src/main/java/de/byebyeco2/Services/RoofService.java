package de.byebyeco2.Services;

import de.byebyeco2.Entities.*;
import de.byebyeco2.Repositories.RoofOfferRepository;
import de.byebyeco2.Repositories.RoofSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoofService {

    @Autowired
    private RoofOfferRepository roofOfferRepository;

    @Autowired
    private RoofSearchRepository roofSearchRepository;

    public RoofOffer saveOrUpdateRoofOffer(RoofOffer roofOffer) {
        roofOfferRepository.save(roofOffer);
        return roofOffer;
    }

    public Optional<RoofOffer> getRoofOfferById(Long id) {
        return roofOfferRepository.findById(id);
    }

    public void deleteRoofOffer(Long id) {
        roofOfferRepository.deleteById(id);
    }

    public List<RoofOffer> listAllRoofOffers() {
        List<RoofOffer> roofs = new ArrayList<>();
        roofOfferRepository.findAll().forEach(roofs::add);
        return roofs;
    }
}
