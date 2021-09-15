package Arrays;

public class CheckIfSorted {
    public static void main(String[] args) {
        int arr1[] = {1,2,2,3,5};
        int arr2[] = {4,3,3,2,1};
        int arr3[] = {1,2,4,3};
        System.out.println("Array is sorted? : " + checkSort(arr1));
        System.out.println("Array is sorted? : " + checkSort(arr2));
        System.out.println("Array is sorted? : " + checkSort(arr3));
    }

    static boolean checkSort(int arr[]){
        int n = arr.length;
        boolean increasing = false;
        boolean decreasing = false;

        for(int i=1; i<n; i++){

            // if the previous element is duplicate we ignore it and skip
            // all conditions for the current element and move onto the 
            // next element using continue
            if(arr[i-1] == arr[i]){
                continue;
            }

            // if previous element is smaller, that means the order should
            // be increasing, and we set increasing flag to true
            if(arr[i-1] < arr[i]){
                increasing = true;
            }

            // if previous element is greater, that means the order should
            // be decreasing, and we set decreasing flag to true
            if(arr[i-1] > arr[i]){
                decreasing = true;
            }
        }

        // if both flags are true, that means the array is not sorted
        // else if either is true and the other is false, the array
        // is sorted and we return true
        if(increasing == true && decreasing == true){
            return false;
        }
        return true;
    }
}
