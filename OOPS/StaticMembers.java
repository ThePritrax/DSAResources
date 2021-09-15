package OOPS;

class Player{

    int id;
    String name;

    // a static variable always has only one copy of itself
    // even when multiple objects are created in a class
    static int playerCount;

    Player(String name){

        // each object will have a unique copy of name and id
        // but the same playerCount is shared among all the objects
        this.name = name;
        id = ++playerCount;
    }

    // a static method (& variable) can be called without creating an object
    // they can be called using class name
    static int printDetails(){
        return playerCount;
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        Player p1 = new Player("Mandem");
        Player p2 = new Player("Willy");

        // this will print 2 since we have created 2 objects and hence
        // id will be updated twice
        // this method could have been called even before creating an object
        // but that would print 0 since no object will be created of the class
        System.out.println("Number of players is : " + Player.printDetails());

        // calling playerCount with an object will still return 2 since it is 
        // a static variable and won't differ for each object
        System.out.println(p1.playerCount);
    }
    
}
