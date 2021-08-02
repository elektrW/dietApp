package pl.wojciechdomagala.dietapp.person.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.wojciechdomagala.dietapp.person.calculatorConfig.GenderConfig;
import pl.wojciechdomagala.dietapp.person.model.PersonData;
import pl.wojciechdomagala.dietapp.person.service.PersonService;

@Controller
public class personControl {
    private PersonService personService;
    private GenderConfig genderConfig;

    @Autowired
    public personControl(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/BMR")
    public double getBMRforPerson(PersonData personData) {
        double bmr = 0;
        if (personData.getMale()) {
            bmr = genderConfig.bmrMan();
        }
        if (personData.getFemale()) {
            bmr = genderConfig.bmrWoman();
        }
        return bmr;
    }


}
