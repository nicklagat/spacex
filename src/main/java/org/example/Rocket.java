package org.example;

/**
 * This is a rocket class. A class is a blueprint or a template of an object
 * Imagine a class or think of a class as a blueprint of a spaceship
 * The blueprint provides specifications for how it should be designed, its dimensions and engines etc
 *
 *
 * Now using the spaceship blueprint we can build/instantiate actual individual spaceship
 * Each spaceship can have its own specification
**/
public class Rocket {

    public static String rocketUrl = "https://www.youtube.com/watch?v=oP76NM4qZhw&t=46s";
    public static String baseUrl = "https://www.youtube.com/";

    public static final String ENDPOINTS = "https://www.spacex.com/";
    public String rocketName;
    public int fuelLevel;
    public String velocity;

    public boolean engineStatus;
    public int maxPayload;
    public int currentPayload;

    public Rocket(String rocketName, int fuelLevel, String velocity, boolean engineStatus, int maxPayload, int currentPayload) {
        this.rocketName = rocketName;
        this.fuelLevel = fuelLevel;
        this.velocity = velocity;
        this.engineStatus = engineStatus;
        this.maxPayload = maxPayload;
        this.currentPayload = currentPayload;
    }

    public Rocket() {

    }


    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public int getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(int maxPayload) {
        this.maxPayload = maxPayload;
    }

    public int getCurrentPayload() {
        return currentPayload;
    }

    public void setCurrentPayload(int currentPayload) {
        this.currentPayload = currentPayload;
    }


    @Override
    public String toString() {
        return "Rocket{" +
                "rocketName='" + rocketName + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", velocity='" + velocity + '\'' +
                ", engineStatus=" + engineStatus +
                ", maxPayload=" + maxPayload +
                ", currentPayload=" + currentPayload +
                '}';
    }


    public void companyName() {
        System.out.println("The company name is learning how to get to spacex");
    }

    public int distanceCovered() {

        return 2 + 2;
    }


    public static String getSpaceX() {

        return "https://www.spacex.com/";

    }




}
