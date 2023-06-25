// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should rearrange the elements of nums such that the modified array follows the given conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

// Example 1:

// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]pos =new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int p=0;
        int n =0;
        
        for(int i:nums){
            if(i>0)
                pos[p++]=i;
            else
                neg[n++]=i;
        }
        int k =0;
        n=0;
        p=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i] = pos[p++];
            }
            else{
                nums[i] = neg[n++];
            }
        }

        
        return nums;

    }
}
