package OOPS;

class Information {
    String name;
    int id;

    Information(String name, int id){
        // this can be used to refer to the instance variable, which helps
        // in differentiating between instance and local variable if we 
        // don't want to use new variables
        this.name = name;
        this.id = id;
    }

    // this can also be used for method chaining, where the method returns
    // this so that the next method can refer to the object which is used
    // by the current method
    Information editName(String name){
        this.name = name;
        return this;
    }

    Information editId(int id){
        this.id = id;
        return this;
    }

    void printInfo(){
        System.out.printf("Name : %s ID : %d", name, id);
        System.out.println();
    }
}

public class This {
    public static void main(String[] args) {
        Information person1 = new Information("Willy", 69);
        Information person2 = new Information("Mandem", 420);

        person1.printInfo();
        person2.printInfo();

        // after editing name, the method editName returns this, which refers to the
        // person 1 object and hence we can add another method using the '.'
        person1.editName("Toby").editId(80085).printInfo();
    }
    
}
