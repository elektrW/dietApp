package pl.wojciechdomagala.dietapp.person.model;

import pl.wojciechdomagala.dietapp.person.calculatorConfig.ManFactorsConfig;
import pl.wojciechdomagala.dietapp.person.calculatorConfig.WomanFactorsConfig;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "PersonData")
public class PersonData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Data for basic calories
    @NotEmpty(message = "The field cannot be empty")
    @Size(min = 2, message = "At least 2 letters")
    private String firstName;

    @NotEmpty(message = "The field cannot be empty")
    @Size(min = 2, message = "At least 2 letters")
    private String lastName;
    private Gender gender;

    @NotNull(message = "The field cannot be empty")
    @Min(value = 16, message = "The minimum age is 16")
    @Max(value = 123, message = "The maximum age is 123")
    private Integer age;

    @NotNull(message = "The field cannot be empty")
    @Min(value = 130, message = "The minimum growth is 130cm")
    @Max(value = 250, message = "The maximum growth is 250cm")
    private Integer growth;

    @NotNull(message = "The field cannot be empty")
    @Min(value = 20, message = "The minimum weight is 20kg")
    @Max(value = 600, message = "The maximum weight is 600kg")
    private Double weight;

    private double BMR;

    public PersonData() {
    }

    public PersonData(String firstName,
                      String lastName,
                      Gender gender,
                      Integer age,
                      Integer growth,
                      @NotNull Double weight,
                      double BMR) {
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
            this.BMR = BMR;
        }
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public double getBMR() {
        if (getGender() == Gender.MALE) {
            double BMR = ManFactorsConfig.FACTOR_MAN_1.getManFactor()
                    + (ManFactorsConfig.FACTOR_MAN_2.getManFactor() * getWeight())
                    + (ManFactorsConfig.FACTOR_MAN_3.getManFactor() * getGrowth())
                    - (ManFactorsConfig.FACTOR_MAN_4.getManFactor() * getAge());
            System.out.println("BMR mężczyzny to " + BMR);
            return Math.round(BMR);
        }
        if (getGender() == Gender.FEMALE) {
            double BMR = WomanFactorsConfig.FACTOR_WOMAN_1.getWomanFactor()
                    + (WomanFactorsConfig.FACTOR_WOMAN_2.getWomanFactor() * getWeight())
                    + (WomanFactorsConfig.FACTOR_WOMAN_3.getWomanFactor() * getGrowth())
                    - (WomanFactorsConfig.FACTOR_WOMAN_4.getWomanFactor() * getAge());
            System.out.println("BMR kobiety to " + BMR);
            return Math.round(BMR);
        }
        return BMR = 0.0;
    }
}