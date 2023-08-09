package org.example;


/**
 *
 * An interface is like saying this are the set of operations or functionalities that an electric vehicle should be capable
 * of doing in order to say they're an electric car
 *
 * It's like a contract between the interface class and the classes that are implementing the functionalities
 *
 * Its basically saying, yes you want to build an electric vehicle okay go ahead but these are terms and conditions/contract of
 * building the electric vehicle. We don't care how you will build it ,but it should conform to terms or functionalities stated
 *
 *
 * */
public interface ElectricVehicleInfra {

    public String foundation();
    public String getEvInvestors();
    public String getAmountOfCharge();
}
