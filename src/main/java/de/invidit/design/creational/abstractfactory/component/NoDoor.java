package de.invidit.design.creational.abstractfactory.component;

/**
 * Created by mwe on 19.02.2016.
 */
public class NoDoor implements Door {
    @Override
    public double getRobustness() {
        return 0;
    }
}
