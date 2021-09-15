package OOPS;

// Compile time Polymorphism
// Method Overloading by changing the type of arguements
class OverloadType {
    public void addNums(int num1, int num2){
        int res = num1 + num2;
        System.out.println("Sum is : " + res);
    }

    public void addNums(double num1, double num2){
        double res = num1 + num2;
        System.out.println("Sum is : " + res);
    }
}

// Compile time Polymorphism
// Method Overloading by changing the number of arguements
class OverloadNumber {
    public void mulNums(int num1, int num2){
        int res = num1 * num2;
        System.out.println("Product is : " + res);
    }

    public void mulNums(int num1, int num2, int num3){
        int res = num1 * num2 * num3;
        System.out.println("Product is : " + res);
    }
}

class Overriding {
    public String info(){
        return ("This is a vehicle. ");
    }
}

// Run time Polymorphism
// Method Overriding by changing the original method
class Bike extends Overriding {
    @Override
    public String info(){
        return (super.info() + "This is a bike.");
    }
}

class Bus extends Overriding {
    @Override
    public String info(){
        return (super.info() + "This is a bus.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        OverloadType type = new OverloadType();
        type.addNums(3, 5);
        type.addNums(3.2, 5.7);

        OverloadNumber number = new OverloadNumber();
        number.mulNums(4, 3);
        number.mulNums(3, 2, 4);

        Overriding vehicle = new Overriding();
        System.out.println(vehicle.info());
        Bike bike = new Bike();
        System.out.println(bike.info());
        Bus bus = new Bus();
        System.out.println(bus.info());
    }
}
