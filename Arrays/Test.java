package Arrays;

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int k=0; k<n; k++){
            int[] a1 = new int[3];
            int sum1=0;
            for(int i=0; i<n; i++){
                a1[i] = sc.nextInt();
                sum1+=a1[i];
            }

            int[] a2 = new int[3];
            int sum2 = 0;
            for(int i=0; i<n; i++){
                a2[i] = sc.nextInt();
                sum2+=a2[i];
            }

            if(sum1>sum2){
                System.out.println('A');
            }
            else if(sum1<sum2){
                System.out.println('B');
            }
        }

        sc.close();
    }
}