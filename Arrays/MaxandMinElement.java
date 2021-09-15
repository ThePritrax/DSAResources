package Arrays;

public class MaxandMinElement {
    public static void main(String[] args) {
        int arr[] = {5,4,3,7,2};
        int n = arr.length;
        System.out.println("Max element : " + maximumElement(arr, n));
        System.out.println("Min element : " + minimumElement(arr, n));
    }

    public static int maximumElement(int arr[],int n) {
        // we need to find max element, so we set the max variable
        // to the minimum integer value
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            // we check for each element, if it is greater than the 
            // previous max, we update max to the current element
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int minimumElement(int arr[],int n) {
        // we need to find min element, so we set the min variable
        // to the maximum integer value
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            // we check for each element, if it is lesser than the 
            // previous min, we update min to the current element
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
