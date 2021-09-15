package Arrays;

public class ImmediateSmallGreat {
    public static void main(String[] args) {
        int arr[] = {1,2,5,8,10};
        int key = 6;
        System.out.println("Element immediately smaller than " + key + " is " + immediateSmaller(arr, key));
        System.out.println("Element immediately greater than " + key + " is " + immediateGreater(arr, key));
    }

    // function to find the element immediately smaller than the key
    static int immediateSmaller(int arr[], int key){

        // we set nearest to the minimum integer since we need to
        // store the nearest maximum element in it
        int nearest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            // if the current element is smaller than the k and greater than
            // the stored nearest, we store current element in nearest
            if(arr[i]<key && arr[i]>nearest){
                nearest = arr[i];
            }
        }
        return nearest;
    }

    static int immediateGreater(int arr[], int key){

        // we set nearest to the maximum integer since we need to
        // store the nearest minimum element in it
        int nearest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            // if the current element is greater than the k and less than
            // the stored nearest, we store current element in nearest
            if(arr[i]>key && arr[i]<nearest){
                nearest = arr[i];
            }
        }
        return nearest;
    }
}