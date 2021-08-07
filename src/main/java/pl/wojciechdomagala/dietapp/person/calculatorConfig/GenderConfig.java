package pl.wojciechdomagala.dietapp.person.calculatorConfig;

import pl.wojciechdomagala.dietapp.person.model.PersonData;
import pl.wojciechdomagala.dietapp.person.repository.PersonRepository;

public class GenderConfig {

//    public double bmrWoman() {
//        double BMR = WomanFactorsConfig.FACTOR_WOMAN_1.getWomanFactor()
//                    + (WomanFactorsConfig.FACTOR_WOMAN_2.getWomanFactor() * personData.getWeight())
//                    + (WomanFactorsConfig.FACTOR_WOMAN_3.getWomanFactor() * personData.getGrowth())
//                    - (WomanFactorsConfig.FACTOR_WOMAN_4.getWomanFactor() * personData.getAge());
//        return BMR;
//    }
//
//    public double bmrMan() {
//        double BMR = ManFactorsConfig.FACTOR_MAN_1.getManFactor()
//                + (ManFactorsConfig.FACTOR_MAN_2.getManFactor() * 1)
//                + (ManFactorsConfig.FACTOR_MAN_3.getManFactor() * 1)
//                - (ManFactorsConfig.FACTOR_MAN_4.getManFactor() * personData.getAge());
//        return BMR;
//    }

    public double bmrTest() {
        double bmr = 2.0;
        return bmr;
    }
}
