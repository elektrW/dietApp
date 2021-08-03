package pl.wojciechdomagala.dietapp.person.service;

import pl.wojciechdomagala.dietapp.person.model.PersonData;

import java.util.List;

public interface PersonService {
    void bmrCalculator();
    void savePersonInfo(PersonData personData);
    List<PersonData> getPersonInfo();
}
