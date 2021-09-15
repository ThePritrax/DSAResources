package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n){
        if(n==1){
            return 1;
        }

        // using the recursive leap of faith we assume that
        // we already have the factorial of all numbers before
        // n, then we just multiply n to it.
        return n * fact(n-1);
    }
}
