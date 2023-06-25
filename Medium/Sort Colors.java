// only 0,1 and 2 sort 
//input = [2,0,1,0,2] 
//output = [0,0,1,2,2]

class Solution {
    public void sortColors(int[] nums) {
       int l1= 0,r1=0; //2
       int l2=nums.length-1,r2= nums.length-1; //0
       while(r1<nums.length){
           if(nums[r1]!=2){
               nums[l1] =nums[l1]+nums[r1]-(nums[r1]=nums[l1]);
               l1++;
           }
          
           r1++;
         
       }
     //  System.out.println(Arrays.toString(nums));
        while(r2>=0){
           if(nums[r2]!=0){
               nums[l2] =nums[l2]+nums[r2]-(nums[r2]=nums[l2]);
               l2--;
           }
           r2--;
       }

