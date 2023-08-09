package org.example;

public abstract class ElectricVehicle {

    /**
     * An abstract class is like a generalized blueprint. It will give us a basic structure of how we should build our
     * electric vehicles i.e cars, bikes and buses but it won't be specific about details likes the exact battery size or car design
     *
     * And you can't directly create an instance or an object or in this case an electric vehicle from this blueprint because its too abstract
     * Coz we want to know what kind of EV is it a bike, car or a bus
     *
     * it gives a generic idea of an electric vehicle. It sets foundation but isn't complete on its own
     * */

    // class properties
    private String evChargeType;
    private String evChargeCapacity;
    private String evSpeed;
    private String evPrice;

    private String evName;

    public ElectricVehicle() {

    }


    // getters and setters
    public String getEvName() {
        return evName;
    }

    public void setEvName(String evName) {
        this.evName = evName;
    }

    public String getEvChargeType() {
        return evChargeType;
    }

    public void setEvChargeType(String evChargeType) {
        this.evChargeType = evChargeType;
    }

    public String getEvChargeCapacity() {
        return evChargeCapacity;
    }

    public void setEvChargeCapacity(String evChargeCapacity) {
        this.evChargeCapacity = evChargeCapacity;
    }

    public String getEvSpeed() {
        return evSpeed;
    }

    public void setEvSpeed(String evSpeed) {
        this.evSpeed = evSpeed;
    }

    public String getEvPrice() {
        return evPrice;
    }

    public void setEvPrice(String evPrice) {
        this.evPrice = evPrice;
    }

    // class constructor
    public ElectricVehicle(String evName, String evChargeType, String evChargeCapacity, String evSpeed, String evPrice) {
        this.evName = evName;
        this.evChargeType = evChargeType;
        this.evChargeCapacity = evChargeCapacity;
        this.evSpeed = evSpeed;
        this.evPrice = evPrice;
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "evChargeType='" + evChargeType + '\'' +
                ", evChargeCapacity='" + evChargeCapacity + '\'' +
                ", evSpeed='" + evSpeed + '\'' +
                ", evPrice='" + evPrice + '\'' +
                ", evName='" + evName + '\'' +
                '}';
    }


    // class methods
    public String buildEV() {
        return "It will take 2 months to have a sophisticated EV charging station...";
    }

    public String launchEV() {
        return "We are launching electric vehicles...";
    }


}
