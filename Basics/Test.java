package Basics;

public class Test {

    public static void main(String[] args) {
        int s = 4;
        square(s);
    }

    public static void square(int s){
        //Complete the code given below
        for(int i=0; i<s; i++){
            if(i==0 || i==s-1){
                for(int j=0; j<s; j++){
                    System.out.print("*");  
                }
            }
            else{
                for(int j=0; j<s; j++){
                    if(j==0 || j==s-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}