package Basics;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to check : ");
        int year = sc.nextInt();

        System.out.println("Is is a leap year? " + checkLeap(year));

        int a=5;
        int b=10;
        
        System.out.println(a%b);

        sc.close();
    }

    public static Boolean checkLeap(int year){
        
        // if the year is divisible by 4 it is a leap year, with one exception that
        // it should not be divisible by 100.
        // if the year is divisible by 100, then it should also be divisible by 400 to be
        // a leap year. We check division by 400 since if a number is divisible by 400 then it
        // will also be divisible by 100
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        return false;
    }
}