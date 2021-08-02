package pl.wojciechdomagala.dietapp.person.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.wojciechdomagala.dietapp.person.model.PersonData;
import pl.wojciechdomagala.dietapp.person.service.PersonService;

@Controller
public class personControl {
    private PersonService personService;

    @Autowired
    public personControl(PersonService personService) {
        this.personService = personService;
    }

    public String getBMRforPerson(PersonData personData) {
        //gender
        if (personData.getMale() == true) {

        }
    }


}
