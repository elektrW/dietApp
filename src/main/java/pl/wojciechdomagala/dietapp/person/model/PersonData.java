package pl.wojciechdomagala.dietapp.person.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PersonData")
public class PersonData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Data for basic calories
    @NotBlank(message = "The field cannot be empty")
    private String firstName;
    @NotBlank(message = "The field cannot be empty")
    private String lastName;
    private Boolean isMale;
    private Boolean isFemale;
    @NotNull
    @Size(min = 16, message = "The minimum age is 16")
    private Integer age;
    @NotNull
    @Size(min = 130, message = "The minimum growth is 130cm")
    private Integer growth;
    @NotNull
    @Size(min = 20, message = "The minimum weight is 20kg")
    private Integer weight;
    private Double bmr;

    public PersonData() {}

    public PersonData(String firstName,
                      String lastName,
                      Boolean isMale,
                      Boolean isFemale,
                      Integer age,
                      Integer growth,
                      Integer weight,
                      Double bmr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMale = isMale;
        this.isFemale = isFemale;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.bmr = bmr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getBmr() {
        return bmr;
    }

    public void setBmr(Double bmr) {
        this.bmr = bmr;
    }
}
