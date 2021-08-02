package pl.wojciechdomagala.dietapp.person.model;

import javax.persistence.*;

@Entity
@Table(name = "PersonData")
public class PersonData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Data for basic calories
    private String firstName;
    private String lastName;
    private Boolean isMale;
    private Boolean isFemale;
    private Integer age;
    private Integer growth;
    private Integer weight;

    public PersonData() {}

    public PersonData(String firstName,
                      String lastName,
                      Boolean isMale,
                      Boolean isFemale,
                      Integer age,
                      Integer growth,
                      Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMale = isMale;
        this.isFemale = isFemale;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public Boolean getFemale() {
        return isFemale;
    }

    public void setFemale(Boolean female) {
        isFemale = female;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
