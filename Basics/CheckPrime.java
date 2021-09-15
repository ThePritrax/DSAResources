package Basics;

public class CheckPrime {
    public static void main(String[] args) {
        int num1=17;
        int num2=68;

        System.out.println(checkforprime(num1));
        System.out.println(checkforprime(num2));
    }

    public static boolean checkforprime(int n){

        // 1 is not a prime number
        if(n==1){
            return false;
        }

        // 2 is a prime number
        if(n==2){
            return true;
        }

        // loop starts from 2 to n-1 since a prime number is always divisible
        // by 1 and itself
        for(int i=2; i<n; i++){

            // as soon as we encounter a value of i which leaves zero as remainder
            // when dividing with n, we return false since it means n isn't prime
            if(n%i==0){
                return false;
            }
        }
        
        // if we still haven't returned a value, it means n is prime and we return true
        return true;
    }
}
