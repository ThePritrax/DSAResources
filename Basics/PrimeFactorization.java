package Basics;

public class PrimeFactorization {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 46;

        System.out.printf("Print factors of %d using method 1 : ", num1);
        printPrimes(num1);
        System.out.println();
        System.out.printf("Print factors of %d using method 1 : ", num2);
        printPrimes(num2);
        System.out.println();
        System.out.println();
        System.out.printf("Print factors of %d using method 2 : ", num1);
        printPrime(num1);
        System.out.println();
        System.out.printf("Print factors of %d using method 2 : ", num2);
        printPrime(num2);
    }

    public static void printPrimes(int number){

        // we divide the number by factors starting from 2 till it is exactly divisible
        // we check all numbers from 2 to square root of number since all prime factors
        // of a number are less than or equal to square root of number
        for(int factor=2; factor*factor<=number; factor++){
            while(number%factor==0){
                System.out.print(factor + " ");
                number/=factor;
            }
        }

        // if after checking all the numbers, if it is still not completely factorized i.e.
        // not equal to 1, it means the one factor is greater than square root of the number
        // which will be the number that is remaining still e.g. 46 => 2 x 23
        if(number!=1){
            System.out.print(number);
        }
    }

    public static void printPrime(int number){

        // this is almost similar as the method above but here we need to perform extra steps since
        // instead of checking till square root of n, here we check till the number itself
        for(int factor=2; factor<=number; factor++){
            while(number%factor==0){
                System.out.print(factor + " ");
                number/=factor;
            }
        }
    }
}