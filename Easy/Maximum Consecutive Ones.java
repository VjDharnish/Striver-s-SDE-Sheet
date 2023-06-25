// Given a binary array arr of size N and an integer M. Find the maximum number of consecutive 1's produced by flipping at most M 0's.
 

// Example 1:

// Input:
// N = 3
// arr[] = {1, 0, 1}
// M = 1
// Output:
// 3

class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        
        // code here
        
        int  count = 0,max=0;
        int start = 0;
        int i=0;
        while(i<n){
            if(arr[i] == 1){
                i++;
            }
            else if(m>0){
                m--;
                i++;
            }
            else if(m == 0 && arr[i] == 0){
                if(arr[start] == 0){
                    m++;
                    start++;
                }
                else{
                    start++;
                }
            }
            if(max<(i-start)){
                max= i-start;
            }
        }
        return max;
    }
}
