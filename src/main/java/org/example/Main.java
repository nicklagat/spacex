package org.example;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * You can access class variables/static variables using the className
 * You cannot access them using an instance of a class
 */
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        Rocket rocket = new Rocket();
        rocket.setRocketName("Falcon 9");
        rocket.setCurrentPayload(5000);
        rocket.setEngineStatus(true);
        rocket.setMaxPayload(15000);
        rocket.setVelocity("971001KM/H");

        rocket.companyName();
        int rt = rocket.distanceCovered();
        System.out.println("The return method has now been used: " + rt);


        // trying to access a static variable by creating an instance of the class
        String rck = Rocket.rocketUrl;
        System.out.println(rck);

        String spcx = Rocket.getSpaceX();
        System.out.println(spcx);

        // printing the object details
        System.out.println(rocket);

        // Accessing a static variable
        String access = Rocket.baseUrl;
        System.out.println(access);

        // Accessing public static final String variables
        // Endpoint constants
        String endPoints = Rocket.ENDPOINTS;
        System.out.println("This is how we write static variables with final " + endPoints);


        int[] age = {10, 34, 13, 18, 9};
        for (int ag : age) {
            System.out.println("The age value is: " + ag);
        }


        System.out.println("Hey\t");
        System.out.println("Hey today we are learning to be a dev\b");
        System.out.println("Hey we will make it no matter what..keep pushing\n");
        System.out.println("Hey\r");
        System.out.println("Hey\f");
        System.out.println("Hey\'");
        System.out.println("Hey\"");
        System.out.println("Hey\\");


        String[] arr = {"Jane", "Linda", "Led"};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr.length);


        // looping an array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The array at index: " + i + " " + "is " + arr[i]);
        }

        // summing the array
        int[] numbers = {2, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println(sum);
        }
        System.out.println("The sum is: " + sum);


        Date date = new Date();
        System.out.println(date);

        // we use this simple date format to format our date object
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date currentDate = new Date();
        String formattedDate = simpleDateFormat.format(currentDate);
        System.out.println(formattedDate);


        SpaceXRocket spaceXRocket = new SpaceXRocket();
        spaceXRocket.setRocketName("Tesla Rocket");
        spaceXRocket.launchTonight();
        String tst = spaceXRocket.getRocketName();
        System.out.println(tst);
        spaceXRocket.maxPayload = 67;
        spaceXRocket.fuelLevel = 89000;
        System.out.println(spaceXRocket);


        // compiling an abstract class
        System.out.println("The abstract class");

        ElectricVehicle electricVehicle = new NissanLeafEV();
        System.out.println(electricVehicle.buildEV());
        NissanLeafEV nissanLeafEV = new NissanLeafEV();
        nissanLeafEV.buildEV();
        System.out.println(nissanLeafEV.electricV());
        System.out.println("----------------------");
        System.out.println(nissanLeafEV.launchEV());

        SpaceXRocket spaceXRocket1 = new SpaceXRocket();
        System.out.println(spaceXRocket1);
//        ElectricVehicle electricVehicle1 = new ElectricVehicle(); 'ElectricVehicle' is abstract; cannot be instantiated


        // encapsulation
        ChevroletBoltEV chevroletBoltEV = new ChevroletBoltEV();
        chevroletBoltEV.setBoltEVName("Chevrolet Bolt EV");
        chevroletBoltEV.setBoltEVChargeCapacity("66 kWh battery");
        chevroletBoltEV.setBoltEVChargeType("Level 2 Charging");
        chevroletBoltEV.setBoltEVSpeed("91 mph");
        chevroletBoltEV.setBoltEVPrice("$36,500");
        System.out.println("-------The New EV----------------");
        System.out.println(chevroletBoltEV.getBoltEVName());

        System.out.println(chevroletBoltEV);

        System.out.println("-------The New EV Infrastructure----------------");

        ElectricVehicleInfra electricVehicleInfra = new SparkchargeEvInc();
        System.out.println(electricVehicleInfra.foundation());
        System.out.println(electricVehicleInfra.getAmountOfCharge());
        System.out.println(electricVehicleInfra);


    }
}