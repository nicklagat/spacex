package org.example;


/**
 * The Concrete Classes Implementing the Interface are like specific types of electric vehicles (ElectricCar, ElectricBike) that agree to the "contract" set by the interface
 * They commit to providing the actual mechanisms
 * to perform the operations, but they can do so in their unique ways.
 */
public class SparkchargeEvInc implements ElectricVehicleInfra {


    @Override
    public String toString() {
        return "SparkchargeEvInc { " + "foundation: " + foundation() + ", " + "amountOfCharge: " + getAmountOfCharge() + " }";
    }


    @Override
    public String foundation() {
        return "https://sparkcharge.io/";
    }

    @Override
    public String getEvInvestors() {
        return "https://www.ycombinator.com/";
    }

    @Override
    public String getAmountOfCharge() {
        return "https://www.iea.org/data-and-statistics/data-tools/global-ev-data-explorer";
    }


}
