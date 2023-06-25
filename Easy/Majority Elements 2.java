// Moore voting algotithm ,there will be maximun of 2 majority elements for an array
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count1 =0;
        int  count2=0;
        int num1=0;
        int num2=0;
        for(int i:nums){
            if(num1==i)
                count1++;
            else if(num2==i)
                count2++;
            else if(count1==0){
                num1=i;
                count1=1;
            }
            else if(count2==0){
                num2=i;
                count2=1;
            }
           
            else{
                count1--;
                count2--;
            }

        }
        count1=0;count2=0;
        for(int i:nums){
            if(num1==i)
                count1++;
            else if(num2==i)
                count2++;

        }
        if(count1>nums.length/3)
            res.add(num1);
        if(count2>nums.length/3)
            res.add(num2);
        return res;
    }
}
