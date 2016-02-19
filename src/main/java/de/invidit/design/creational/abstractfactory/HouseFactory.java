package de.invidit.design.creational.abstractfactory;

import de.invidit.design.creational.abstractfactory.component.Door;
import de.invidit.design.creational.abstractfactory.component.Roof;
import de.invidit.design.creational.abstractfactory.component.Wall;

/**
 * Created by mwe on 19.02.2016.
 */
public abstract class HouseFactory {
    abstract Door createDoor();
    abstract Wall createWall();
    abstract Roof createRoof();
}
