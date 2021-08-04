package pl.wojciechdomagala.dietapp.person.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/person")
    public String viewHomePage(Model model) {
        PersonData personData = new PersonData();
        personData.setBmr(3.0);
        model.addAttribute("personInfoList", personService.getPersonInfo());
        return "person";
    }

    @GetMapping("/showPersonInfoForm")
    public String showNewPersonForm(Model model) {
        PersonData personData = new PersonData();
        model.addAttribute("personData", personData);
        return "new_person";
    }

    @PostMapping("/savePersonInfo")
    public String savePersonInfo(@ModelAttribute PersonData personData) {
        personService.savePersonInfo(personData);
        return "redirect:/person";
    }

    @GetMapping("/showFormForUpdatePerson/{id}")
    public String showFormForUpdatePersonData(@PathVariable long id, Model model) {
        //get
        PersonData personData = personService.getPersonDataById(id);
        //update
        model.addAttribute("personData", personData);
        return "update_personData";
    }

//THIS CODE NEED TO WAIT FOR CLASSES 'CALCULATOR BMR'
//    public double getBMRforPerson(PersonData personData) {
//        double bmr = 0;
//        if (personData.getMale()) {
//            bmr = this.genderConfig.bmrMan();
//        }
//        if (personData.getFemale()) {
//            bmr = this.genderConfig.bmrWoman();
//        }
//        return bmr;
//    }


}
