package OOPS;

// SUPER CLASS
class Car {
    String name;
    int modelNum, price;

    Car(String name, int modelNum, int price){
        this.name = name;
        this.modelNum = modelNum;
        this.price = price;
    }

    // superclass method, can be accessed by all subclasses and
    // the subclass objects
    void priceAfterTax(int tax){
        price += tax;
    }

    // superclass method, can be accessed by all subclasses and
    // also be modified in the subclasses
    String printInfo(){
        return("Details of the car are : Name : " + name + ", Model Number : " 
        + modelNum + ", Price : " + price);
    }
}

// SUB CLASS of Car
class EliteCar extends Car {
    String colour;

    // constructor of the subclass which uses the super keyword to inherit
    // the variables of the superclass constructor
    EliteCar(String name, int modelNum, int price, String colour){
        super(name, modelNum, price);
        this.colour = colour;
    }

    // subclass method
    void colorCombo(String altColour){
        colour += " + " + altColour;
    }

    // superclass method being modified, which means it is being overridden
    // and we mention it for better code readability
    // we are adding more members to the print method
    @Override
    String printInfo(){
        return(super.printInfo() + ", Colours : " + colour);
    }
}

// SUB CLASS OF EliteCar
class Bugatti extends EliteCar {
    int dayOfManufacture, dayOfPurchase;

    // we again use a subclass constructor to inherit the variables superclass constructor
    Bugatti(String name, int modelNum, int price, String colour, 
    int dayOfManufacture, int dayOfPurchase){
        super(name, modelNum, price, colour);
        this.dayOfManufacture = dayOfManufacture;
        this.dayOfPurchase = dayOfPurchase;
    }

    // subclass method
    int timeOnDisplay(){
        return dayOfPurchase - dayOfManufacture;
    }

    // we are again overriding the superclass method and adding more members
    @Override
    String printInfo(){
        return(super.printInfo() + ", Day of Manufacture : " + dayOfManufacture
        + ", Day of Purchase : " + dayOfPurchase);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // object of the superclass, which can't access methods of the subclasses
        Car myCar = new Car("Ford", 72, 200);
        myCar.priceAfterTax(65);
        // here print method of the superclass is being called hence the modified version
        // is NOT being called
        System.out.println(myCar.printInfo());

        // object of the subclass, which can access all the methods of sub and superclasses
        Bugatti myBugatti = new Bugatti("Veron", 69, 420, "Orange", 15, 27);
        myBugatti.priceAfterTax(35);
        myBugatti.colorCombo("Black");
        System.out.println(myBugatti.printInfo());
        System.out.println("My car was on display for " + myBugatti.timeOnDisplay() + " days");
    }
}
