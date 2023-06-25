
//Kadane algorithm
class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum = nums[0];
       int sum =nums[0];
       for(int  i=1;i<nums.length;i++){
           sum+=nums[i];
           if(nums[i]>sum)
                sum=nums[i];
           if(maxSum<sum)
            maxSum =sum;
       }
       return maxSum;
    }
}
