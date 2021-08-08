package pl.wojciechdomagala.dietapp.person.model;

public enum Gender {

    //ISO/IEC 5218 - international standard of human "sexes"
    UNKNOWN("0"),
    MALE("1"),
    FEMALE("2");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}