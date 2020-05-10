package de.byebyeco2.Repositories;

import de.byebyeco2.Entities.RoofOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoofOfferRepository extends JpaRepository<RoofOffer, Long> {
}
