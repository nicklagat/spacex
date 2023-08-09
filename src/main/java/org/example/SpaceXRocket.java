package org.example;

/**
 *  Here SpaceXRocket is a child with a method that prints a string
 *  SpaceXRocket inherits all the properties in the Rocket Class
 *  The Rocket class acts the parent while SpaceXRocket acts as the child
 *  SpaceXRocket has its own method/behavior which is called launchTonight that does not return anything but just
 *  prints a message.
 *
 *
 *  So inheritance is basically having a class extending another class...its like an extension of the other class
 *  So the SpaceXRocket class has access to all properties of the Rocket class
 * */
public class SpaceXRocket extends Rocket{

    public void launchTonight(){
        System.out.println("The name of the rocket being launched is: "+rocketName);
    }
}
