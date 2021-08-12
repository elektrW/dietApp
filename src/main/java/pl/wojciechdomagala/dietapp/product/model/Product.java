package pl.wojciechdomagala.dietapp.product.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Product basic information
    @NotEmpty(message = "The field cannot be empty")
    @Size(min = 2, message = "At least 2 letters")
    private String name;

    @NotNull(message = "The field cannot be empty")
    @Min(value = 0, message = "The minimum weight is 0 g")
    @Max(value = 1000, message = "The maximum weight is 1000g")
    private Double weight;

    @NotNull(message = "The field cannot be empty")
    @Min(value = 0, message = "The minimum calories is 0 kcal")
    @Max(value = 5000, message = "The maximum calories is 5000 kcal")
    private Double calories;

    @NotNull(message = "The field cannot be empty")
    @Min(value = 0, message = "The minimum protein is 0 g")
    @Max(value = 250, message = "The maximum protein is 250 g")
    private Double protein;

    @NotNull(message = "The field cannot be empty")
    @Min(value = 0, message = "The minimum fat is 0 g")
    @Max(value = 25, message = "The maximum fat is 50 g")
    private Double fat;

    @NotNull(message = "The field cannot be empty")
    @Min(value = 0, message = "The minimum carbohydrates is 0 g")
    @Max(value = 300, message = "The minimum carbohydrates is 0 g")
    private Double carbohydrates;

    public Product() {}

    public Product(Long id, String name, Double weight, Double calories, Double protein, Double fat, Double carbohydrates) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
