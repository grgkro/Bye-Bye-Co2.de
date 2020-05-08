package de.byebyeco2.Controller;

import de.byebyeco2.Entities.ExampleCalculator;
import de.byebyeco2.Dtos.ExampleCalculatorDto;
import de.byebyeco2.Services.ExampleCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ExampleCalculatorController {

        @Autowired
        private ExampleCalculatorService exampleCalculatorService;

        /**
         * @return: all groups from the repository
         */
        @GetMapping("spring/getAllGroups")
        public List<ExampleCalculatorDto> getAllGroups() {
            return exampleCalculatorService.listGroups();
        }


        /**
         * Get's an example as JSON from the angular-client and saves it as a new example into the repository
         *
         * @return: boolean if successful
         */
        @PostMapping("exampleCalculator/saveExample")
        public Boolean saveExample (@RequestBody ExampleCalculator exampleCalculator) {
            exampleCalculatorService.saveExample(exampleCalculator);
           // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm");
            // TODO: replace LocalDateTime.now() in the new Group with the actual formatted timestamps from the GroupDto



            return true;
        }

}
