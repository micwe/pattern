package de.invidit.design.creational.abstractfactory.component;

import de.invidit.design.creational.abstractfactory.Door;

/**
 * Created by mwe on 19.02.2016.
 */
public class WoodenDoor implements Door {
    @Override
    public double getRobustness() {
        return 1.2;
    }
}
