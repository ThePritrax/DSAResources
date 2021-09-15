package Arrays;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 2;

        System.out.println("Original array : " + Arrays.toString(arr));

        rotateFunc(arr, k);
    }

    // we create the function to reverse the given parts of the array
    // we need to input the starting and ending index of the part of 
    // array we need to reverse
    static void reverseFunc(int arr[], int start, int end){
        int first = start;
        int last = end;

        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    static void rotateFunc(int arr[], int k){
        int n = arr.length;

        // first we reverse all elements from 0 to k-1
        reverseFunc(arr, 0, k-1);
        // then we reverse all elements from k to n-1
        reverseFunc(arr, k, n-1);
        // lastly we reverse the entire array
        reverseFunc(arr, 0, n-1);

        System.out.println("Rotated array : " + Arrays.toString(arr));
    }
}
