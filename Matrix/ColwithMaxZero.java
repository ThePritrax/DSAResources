package Matrix;

public class ColwithMaxZero {
    public static void main(String[] args) {
        int n = 3;
        int arr[][] = { {1,1,1},
                        {0,0,0},
                        {1,0,1} };

        System.out.println(zeroColumn(arr, n));
    }
    
    public static int zeroColumn(int a[][], int n){

        // we initialize variables to keep track of
        // 1. number of zeroes in each column
        // 2. maximum number of zeroes among all columns
        // 3. index of the column with maximum zeroes
        int countOfZero = 0;
        int maxCount = 0;
        int resCol = 0;

        for(int i=0; i<n; i++){

            // we reset the count of zero for every column after checking the zeroes for one column
            countOfZero = 0;

            for(int j=0; j<n; j++){

                // rather than selecting elements in the format of row and column, we select
                // as column and row so that we first traverse the columns and then change row
                if(a[j][i] == 0){

                    // if element is equal to zero we increase the countofzero and then compare it to max count
                    // and change max count if countofzero is greater than maxcount
                    // we also change the resultant column to the current column when maxcount changes
                    countOfZero++;
                    if(countOfZero > maxCount){
                        maxCount = countOfZero;
                        resCol = i;
                    }
                }
            }
        }

        // we return the resultant column, which will be the index the the column that has most zeroes
        return resCol;
    }
}
