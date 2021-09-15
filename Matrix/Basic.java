package Matrix;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[][] = new int[3][4];

        System.out.println("Enter the elements of the matrix : ");
        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        printMatrix(arr1);

        System.out.println();

        int m = 3;

        // we only specify the number of rows (which always needs to be specified)
        // number of columns can be according to need
        int arr2[][] = new int[m][];

        jaggedMatrix(arr2);


        sc.close();
    }

    public static void printMatrix(int a[][]){
        System.out.println("The Matrix is : ");

        // for traversing each row
        for(int i=0; i<a.length; i++){

            // for traversing each column in that row, i.e. each element of the row
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void jaggedMatrix(int a[][]){
        System.out.println("The Jagged Matrix is : ");
        for(int i=0; i<a.length; i++){

            // we set the length of each row as the row number + 1 (since it is 0 based numbering)
            a[i] = new int[i+1];
            for(int j=0; j<a[i].length; j++){

                // we set each element equal to it's row number
                a[i][j] = i;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}