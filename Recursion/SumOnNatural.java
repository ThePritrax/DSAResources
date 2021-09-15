package Recursion;

public class SumOnNatural {
    public static void main(String[] args) {
        System.out.println(naturalSum(4));
    }

    static int naturalSum(int n){
        if(n==1){
            return 1;
        }
        return n + naturalSum(n-1);
    }
}
