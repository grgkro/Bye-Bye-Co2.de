package de.byebyeco2.ExampleCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
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
         * Get's a group as JSON from the angular-client and saves it as a new group into the repository
         *
         * @return: an updated list of all groups from the database
         */
        @PostMapping("spring/createGroup")
        public List<ExampleCalculatorDto> createGroup (@RequestBody ExampleCalculatorDto exampleCalculatorDto) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm");
            // TODO: replace LocalDateTime.now() in the new Group with the actual formatted timestamps from the GroupDto



            return exampleCalculatorService.listGroups();
        }

}
