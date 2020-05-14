package de.byebyeco2.Repositories;

import de.byebyeco2.Entities.RoofSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoofSearchRepository extends JpaRepository<RoofSearch, Long> {
}
