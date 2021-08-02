package pl.wojciechdomagala.dietapp.person.calculatorConfig;

import pl.wojciechdomagala.dietapp.person.model.PersonData;

public class GenderConfig {

    PersonData personData;

    public double bmrWoman() {
        double BMR = WomanFactorsConfig.FACTOR_WOMAN_1.getWomanFactor()
                    + (WomanFactorsConfig.FACTOR_WOMAN_2.getWomanFactor() * personData.getWeight())
                    + (WomanFactorsConfig.FACTOR_WOMAN_3.getWomanFactor() * personData.getGrowth())
                    - (WomanFactorsConfig.FACTOR_WOMAN_4.getWomanFactor() * personData.getAge());
        return BMR;
    }

    public double bmrMan() {
        double BMR = ManFactorsConfig.FACTOR_MAN_1.getFactor()
                + (ManFactorsConfig.FACTOR_MAN_2.getFactor() * personData.getWeight())
                + (ManFactorsConfig.FACTOR_MAN_3.getFactor() * personData.getGrowth())
                - (ManFactorsConfig.FACTOR_MAN_4.getFactor() * personData.getAge());
        return BMR;
    }

}
