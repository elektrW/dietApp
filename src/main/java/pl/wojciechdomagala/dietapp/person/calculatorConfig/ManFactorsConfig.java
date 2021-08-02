package pl.wojciechdomagala.dietapp.person.calculatorConfig;

public enum ManFactorsConfig {
    //Pattern for men BMR: BMR = 66 + (13,7 × weight[kg]) + (5 × growth[cm]) - (6,8 × age[years]).

    //Factors used in bmr calc for men
    FACTOR_MAN_1(66),
    FACTOR_MAN_2(13.7),
    FACTOR_MAN_3(5),
    FACTOR_MAN_4(6.8);

    private double manFactor;

    ManFactorsConfig(double factor) {
        this.manFactor = factor;
    }

    public double getFactor() {
        return manFactor;
    }
}
