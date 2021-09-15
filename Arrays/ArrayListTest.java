package Arrays;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Priyansh");
        al.add("was");
        al.add("a");
        al.add("Noob");
        al.add("Coder");
        System.out.println(al);

        // removing an element "Noob"
        al.remove("Noob");
        System.out.println(al);

        // changing an element at index 1 to "is"
        // when we print the set method, it prints the element
        // which is being replaced
        System.out.println("The element replaced is : " + al.set(1, "is"));
        System.out.println(al);

        // adding an element "Great" to index 3, this shifts the
        // current element at that index by +1
        al.add(3, "Great");
        System.out.println(al);

        // for loop to iterate through the array list, for each loop
        // can also be used
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i) + " ");
        }
    }
}
