package Arrays;

public class DistinctElements {
    public static void main(String[] args) {
        int a[] = {2,2,3,2};
        int n = a.length;

        System.out.println(distinctElements(a, n));
    }

    // O(n^2) Approach
    public static int distinctElements(int arr[], int n){
        int count = 0;

        for(int i=0; i<n; i++){

            // for every element, we reset the boolean value to true
            boolean isDistinct = true;

            // we start checking from 1 element after i
            for(int j=i+1; j<n; j++){

                // if we find a duplicate, we update the boolean value to false
                // and exit the loop instantly
                if(arr[i]==arr[j]){
                    isDistinct = false;
                    break;
                }
            }

            // after every element we check if it is distinct or not, if it is,
            // we increment the counter
            if(isDistinct == true){
                count++;
            }
        }
        return count;
    }
}
