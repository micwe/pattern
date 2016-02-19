package de.invidit.design.creational.abstractfactory.component;

import de.invidit.design.creational.abstractfactory.Wall;

/**
 * Created by mwe on 19.02.2016.
 */
public class WoodenWall implements Wall {
    @Override
    public double getInsulation() {
        return 2.98;
    }
}
