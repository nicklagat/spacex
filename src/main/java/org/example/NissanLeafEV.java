package org.example;

/**
 * The Concrete Classes (Specific EV Blueprints), like ElectricCar or ElectricBike, are complete blueprints
 * derived from the general idea, filling in the specific details and making it possible to create actual objects (instances).
 *
 * This class NissanLeafEV is an example of a Specific EV Blueprint...why? because from the basic structure of our abstract class
 * Electric vehicle, we are able to implement specific details of how we want our EV to look like etc
 * */

public class NissanLeafEV extends ElectricVehicle {

    public String electricV() {

        return "We are getting values from the abstract electric vehicle class";
    }
}
