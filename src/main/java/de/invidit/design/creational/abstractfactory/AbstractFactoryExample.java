package de.invidit.design.creational.abstractfactory;

/**
 * Created by mwe on 19.02.2016.
 */
public class AbstractFactoryExample {
    public static void main(String...args) {

        // change type of house: 1 or 2
        HouseFactory factory = new HouseFactoryDecider().createRequiredFactory(1);

        Door door = factory.createDoor();
        Roof roof = factory.createRoof();
        Wall firstWall = factory.createWall();
        Wall secondWall = factory.createWall();
        Wall thirdWall = factory.createWall();
        Wall fourthWall = factory.createWall();

        System.out.println("House components created:");
        System.out.println("Door: " + door.getClass());
        System.out.println("Roof: " + roof.getClass());
        System.out.println("FirstWall: " + firstWall.getClass());
        System.out.println("SecondWall: " + secondWall.getClass());
        System.out.println("ThirdWall: " + thirdWall.getClass());
        System.out.println("FourthWall: " + fourthWall.getClass());
    }
}
