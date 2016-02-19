package de.invidit.design.creational.abstractfactory.component;

import de.invidit.design.creational.abstractfactory.Roof;

/**
 * Created by mwe on 19.02.2016.
 */
public class StoneRoof implements Roof {
    @Override
    public String getCovering() {
        return "Pebble";
    }
}
