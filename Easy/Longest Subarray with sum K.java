  public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int max =0;
        HashMap<Integer,Integer> map  =new HashMap<>();
        int sum =0;
        for(int i =0;i<A.length;i++){
            sum+= A[i];
            if(sum == K){
                max =Math.max(max,i+1);
            }
            if(map.containsKey(sum-K)){
                int len =i-map.get(sum-K);
               max= Math.max(max,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }
    
    
}
