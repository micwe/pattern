package de.invidit.design.creational.abstractfactory;

/**
 * Created by mwe on 19.02.2016.
 */
public abstract class HouseFactory {
    abstract Door createDoor();
    abstract Wall createWall();
    abstract Roof createRoof();
}
