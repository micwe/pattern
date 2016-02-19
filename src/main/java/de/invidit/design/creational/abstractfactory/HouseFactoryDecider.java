package de.invidit.design.creational.abstractfactory;

/**
 * Created by mwe on 19.02.2016.
 */
public class HouseFactoryDecider {
    public HouseFactory createRequiredFactory(int factoryTye) {
        HouseFactory factory;

        switch (factoryTye) {
            case 1:
                factory = new TreeHouseFactory();
                break;
            case 2:
                factory = new CountryHouseFactory();
                break;
            default:
                throw new IllegalArgumentException("No such house type supportet.");

        }

        return factory;
    }
}
