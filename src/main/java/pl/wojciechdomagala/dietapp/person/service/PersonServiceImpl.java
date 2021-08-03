package pl.wojciechdomagala.dietapp.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojciechdomagala.dietapp.person.model.PersonData;
import pl.wojciechdomagala.dietapp.person.repository.PersonRepository;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void bmrCalculator() {
    }

    @Override
    public void savePersonInfo(PersonData personData) {
        this.personRepository.save(personData);
    }

    @Override
    public List<PersonData> getPersonInfo() {
        return personRepository.findAll();
    }
}
