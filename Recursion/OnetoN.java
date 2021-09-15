package Recursion;

public class OnetoN {
    public static void main(String[] args) {
        printOnetoN(5);
    }

    static void printOnetoN(int n){
        // base case, we exit when 0 is encountered
        if(n==0){
            return;
        }

        // we call the function for the previous number
        printOnetoN(n-1);

        // then we print the current n
        System.out.print(n + " ");
    }
}