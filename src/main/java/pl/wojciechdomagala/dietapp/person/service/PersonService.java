package pl.wojciechdomagala.dietapp.person.service;

import pl.wojciechdomagala.dietapp.person.model.PersonData;

import java.util.List;

public interface PersonService {
    void savePersonInfo(PersonData personData);
    List<PersonData> getPersonInfo();
    PersonData getPersonDataById(Long id);
    void deletePersonById(Long id);
}
