package Recursion;

public class NtoOne {
    public static void main(String[] args) {
        printNto1(5);
    }

    static void printNto1(int n){
        // base case, we exit when 0 is encountered
        if(n==0){
            return;
        }

        // we print the current n
        System.out.print(n + " ");

        // then we call the function for n-1
        printNto1(n-1);
    }
}
