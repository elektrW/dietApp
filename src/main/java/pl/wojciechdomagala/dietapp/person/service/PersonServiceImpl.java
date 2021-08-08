package pl.wojciechdomagala.dietapp.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojciechdomagala.dietapp.person.model.PersonData;
import pl.wojciechdomagala.dietapp.person.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void savePersonInfo(PersonData personData) {
        this.personRepository.save(personData);
    }

    @Override
    public List<PersonData> getPersonInfo() {
        return personRepository.findAll();
    }

    @Override
    public PersonData getPersonDataById(Long id) {
        Optional<PersonData> optionalPersonData = personRepository.findById(id);
        PersonData personData = null;
        if (optionalPersonData.isPresent()) {
            personData = optionalPersonData.get();
        } else {
            throw new RuntimeException("PersonData not found for id: " + id);
        }
        return  personData;
    }

    @Override
    public void deletePersonById(Long id) {
        this.personRepository.deleteById(id);
    }

}
