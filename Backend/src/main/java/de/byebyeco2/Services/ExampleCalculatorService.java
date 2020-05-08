package de.byebyeco2.Services;

import de.byebyeco2.Dtos.ExampleCalculatorDto;
import de.byebyeco2.Entities.ExampleCalculator;
import de.byebyeco2.Repositories.ExampleCalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleCalculatorService {

    @Autowired
    private ExampleCalculatorRepository exampleCalculatorRepository;


    public List<ExampleCalculatorDto> listGroups() {
        return null;
    }

    /**
     * saves the provided group to the database
     */
    public void saveGroup(ExampleCalculator exampleCalculator) {
        exampleCalculatorRepository.save(exampleCalculator);
    }

    public Boolean saveExample(ExampleCalculator exampleCalculator) {
        exampleCalculatorRepository.save(exampleCalculator);
        return true;
    }
}
