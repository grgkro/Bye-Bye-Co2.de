package de.byebyeco2.Services;

import de.byebyeco2.Entities.RentalObject;
import de.byebyeco2.Entities.Roof;

import java.util.List;

public interface RentalObjectService {

    List<Roof> listAll();

    RentalObject getById(Long id);

    RentalObject saveOrUpdate(RentalObject rentalObject);

    void delete(Long id);

}
