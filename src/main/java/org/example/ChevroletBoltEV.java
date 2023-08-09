package org.example;


/**
 * With encapsulation, the EV hides the intricacies like the  inner workings of the battery or motor from the outside world
 * exposing only what is needed like the accelerator or charging port.
 * This is a way of preventing accidental damaging of the inner working of the vehicle.  Imagine you had crucial data that was accidentally
 * modified, how would this sound?
 * <p>
 * So encapsulation helps prevent such accidental acts by bundling data to restrict access.
 * <p>
 * We end up implementing getters and setters which control how we/the interactions with the internal mechanism of the EV
 */
public class ChevroletBoltEV {
    public String getBoltEVName() {
        return boltEVName;
    }

    public void setBoltEVName(String boltEVName) {
        this.boltEVName = boltEVName;
    }

    public String getBoltEVSpeed() {
        return boltEVSpeed;
    }

    public void setBoltEVSpeed(String boltEVSpeed) {
        this.boltEVSpeed = boltEVSpeed;
    }

    public String getBoltEVPrice() {
        return boltEVPrice;
    }

    public void setBoltEVPrice(String boltEVPrice) {
        this.boltEVPrice = boltEVPrice;
    }

    public String getBoltEVChargeCapacity() {
        return boltEVChargeCapacity;
    }

    public void setBoltEVChargeCapacity(String boltEVChargeCapacity) {
        this.boltEVChargeCapacity = boltEVChargeCapacity;
    }

    public String getBoltEVChargeType() {
        return boltEVChargeType;
    }

    public void setBoltEVChargeType(String boltEVChargeType) {
        this.boltEVChargeType = boltEVChargeType;
    }

    private String boltEVName;

    @Override
    public String toString() {
        return "ChevroletBoltEV{" + "boltEVName='" + boltEVName + '\'' +
                ", boltEVSpeed='" + boltEVSpeed + '\'' + ", boltEVPrice='"
                + boltEVPrice + '\'' + ", boltEVChargeCapacity='" +
                boltEVChargeCapacity + '\'' + ", boltEVChargeType='" +
                boltEVChargeType + '\'' + '}';
    }

    private String boltEVSpeed;

    private String boltEVPrice;
    private String boltEVChargeCapacity;
    private String boltEVChargeType;

}
