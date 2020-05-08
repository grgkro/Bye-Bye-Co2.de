package de.byebyeco2.Repositories;

import de.byebyeco2.Entities.Roof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoofRepository extends JpaRepository<Roof, Long> {
}
