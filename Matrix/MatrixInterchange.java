package Matrix;
import java.util.Scanner;

public class MatrixInterchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int m = 4;

        int arr[][] = new int[n][m];

        System.out.println("Enter the elements of the matrix : ");
        for(int i=0; i<n; i++){
            for(int j=0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        interchange(arr, n, m);

        sc.close();
    }

    public static void interchange(int a[][], int n, int m){
        for(int i=0; i<n; i++){
            // we traverse just through each row and swap the first element of that row
            // with the last element of the row
            int temp = a[i][0];
            a[i][0] = a[i][m-1];
            a[i][m-1] = temp;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
