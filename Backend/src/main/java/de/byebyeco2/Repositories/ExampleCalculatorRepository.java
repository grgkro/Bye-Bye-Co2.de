package de.byebyeco2.Repositories;

import de.byebyeco2.Entities.ExampleCalculator;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ExampleCalculatorRepository extends JpaRepository<ExampleCalculator, Long> {
}
