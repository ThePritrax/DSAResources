package OOPS;

// Abstract class, having variables, abstract methods and non abstract methods
abstract class Shape {
    String colour;

    Shape(String colour){
        this.colour = colour;
    }

    // abstract methods have no body, just declaration
    abstract double area();
    abstract String display();

    // an abstract class can contain non abstract methods as well
    void details(){
        System.out.println("This is a non-abstract method in the abstract class");
    }
}

// subclass of abstract class must contain all the abstract
// methods of the parent class
class Rectangle extends Shape {

    double length, width;
    

    Rectangle(String colour, double length, double width) {

        // we use the super keyword to call the parent constructor
        super(colour);
        this.length = length;
        this.width = width;
    }

    // we need to override all the abstract methods
    // in the abstract class
    @Override
    double area() {
        return length * width;
    }

    @Override
    String display() {
        return ("Colour of the rectangle is " + colour 
        + " and the area is " + area()) ;
    }
    
}

class Circle extends Shape {

    double radius;

    Circle(String colour, double radius){
        super(colour);
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14*radius*radius;
    }

    @Override
    String display() {
        return ("Colour of the circle is " + colour 
        + " and the area is " + area());
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("aquamarine", 4.2, 2.5);
        Circle circle = new Circle("turquoise", 3.7);

        System.out.println(rectangle.display());
        System.out.println(circle.display());
    }
}
