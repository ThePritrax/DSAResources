package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    // Fibonacci series : 0 1 1 2 3 5 8 13 21 ...
    // we define the base case as fib(0)=0 and fib(1)=1
    // (basically converting the access of terms into 0 based indexing)
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
