package OOPS;

interface Animal {
    // we just define the method inside the interface
    // without specifying what the method does
    void breed(String b);
    void colour(String c);
    void age(int a);
    void display();
}

class Dog implements Animal {

    String brd, col;
    int a;

    // we have to use all the methods of the interface
    // which this class implements and provide the content
    // of the method inside the class
    @Override
    public void breed(String brd) {
        this.brd = brd;
    }

    @Override
    public void colour(String col) {
        this.col = col;
    }

    @Override
    public void age(int a) {
        this.a = a;
    }

    public void display(){
        System.out.println("Breed : " + brd + ", Age : " + a + ", Colour : " + col);
    }
    
}

class Cat implements Animal {

    String breed, colour;
    int age;

    @Override
    public void breed(String breed) {
        this.breed = breed;
    }

    @Override
    public void colour(String colour) {
        this.colour = colour;
    }

    @Override
    public void age(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Breed : " + breed + ", Age : " + age + ", Colour : " + colour);
    }
    
}

interface Taste {
    void howsTheTaste(String t);
}

interface Price {
    void howsThePrice(String p);
}

// a class can implement 2 interfaces and it will have to 
// implement all the methods of both the classes
class Food implements Taste, Price {

    String food, taste, price;
    int score;

    Food(String foodItem){
        food = foodItem;
    }

    @Override
    public void howsThePrice(String price) {
        this.price = price;
        
    }

    @Override
    public void howsTheTaste(String taste) {
        this.taste = taste;
    }

    public void finalScore(int score){
        this.score = score;
    }

    public void display(){
        System.out.println("Food Item : " + food + ", Taste : " + taste 
        + ", Price : " + price + ", Score (/10) : " + score);
    }
}

public class Interface {
    public static void main(String[] args) {
        // we cannot create an instance of the interface itself
        // but we can create an object of the class which implements
        // it and call the methods using that object
        Dog myDog = new Dog();
        myDog.age(12);
        myDog.breed("Labrador");
        myDog.colour("Brown");
        myDog.display();

        Cat myCat = new Cat();
        myCat.age(5);
        myCat.breed("Persian");
        myCat.colour("White");
        myCat.display();

        Food myFood = new Food("Pasta");
        myFood.howsTheTaste("Great");
        myFood.howsThePrice("Overpriced");
        myFood.finalScore(7);
        myFood.display();
    }
}
