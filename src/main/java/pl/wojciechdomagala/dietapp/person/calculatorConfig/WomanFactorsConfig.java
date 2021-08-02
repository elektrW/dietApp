package pl.wojciechdomagala.dietapp.person.calculatorConfig;

public enum WomanFactorsConfig {
    //Pattern for women BMR: BMR = 655 + (9,6 × weight[kg]) + (1,8 × growth[cm]) - (4,7 × age[years]).

    //Factors used in bmr calc for women
    FACTOR_WOMAN_1(655),
    FACTOR_WOMAN_2(9.6),
    FACTOR_WOMAN_3(1.8),
    FACTOR_WOMAN_4(4.7);

    private double womanFactor;

    WomanFactorsConfig(double womanFactor) {
        this.womanFactor = womanFactor;
    }

    public double getWomanFactor() {
        return womanFactor;
    }
}
