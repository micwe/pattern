package de.invidit.design.creational.abstractfactory;

import de.invidit.design.creational.abstractfactory.component.*;

/**
 * Created by mwe on 19.02.2016.
 */
public class CountryHouseFactory extends HouseFactory {
    @Override
    Door createDoor() {
        return new WoodenDoor();
    }

    @Override
    Wall createWall() {
        return new WoodenWall();
    }

    @Override
    Roof createRoof() {
        return new WoodenRoof();
    }
}
