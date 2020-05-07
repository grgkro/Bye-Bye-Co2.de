package de.byebyeco2.ExampleCalculator;

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

}
