package OOPS;

class Encapsulated {
    private String name;

    // we use a setter method to set the value of private 
    // variable and use return this so as to use method
    // chaining with the getter method
    Encapsulated setName(String name){
        this.name = name;
        return this;
    }

    // we use the getter method to return the value of
    // the variable we have created using the setter method
    String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulated obj = new Encapsulated();
        String res = obj.setName("Toby").getName();
        System.out.println(res);
    }
}
