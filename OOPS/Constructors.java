package OOPS;

class KDRatio {

    int kill, death;

    // the constructor takes two int values as parameters
    // and assigns them to the variables in class
    KDRatio(int noOfKills, int noOfDeaths){
        kill = noOfKills;
        death = noOfDeaths;
    }

    void print(){
        System.out.println("Kill Death Ratio is " + kill/death);
    }
}

public class Constructors{
    public static void main(String[] args) {

        // we create 2 new objects of the class KDRatio and 
        // pass values to them
        KDRatio valorant = new KDRatio(20, 4);
        KDRatio csgo = new KDRatio(12, 3);

        // we call the print function created in the class KDRatio
        // with the two objects created
        valorant.print();
        csgo.print();
    }
}
