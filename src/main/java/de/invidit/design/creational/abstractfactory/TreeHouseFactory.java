package de.invidit.design.creational.abstractfactory;

import de.invidit.design.creational.abstractfactory.component.*;

/**
 * Created by mwe on 19.02.2016.
 */
public class TreeHouseFactory extends HouseFactory {
    @Override
    Door createDoor() {
        return new NoDoor();
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
