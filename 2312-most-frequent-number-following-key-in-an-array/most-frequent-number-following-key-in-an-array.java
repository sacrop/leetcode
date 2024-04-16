class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                int val=nums[i+1];
                mp.put(val,mp.getOrDefault(val,0)+1);
            }
        }
        int v=Integer.MIN_VALUE;
        int indx=-1;
        for(Map.Entry<Integer,Integer> et:mp.entrySet()){
            if(et.getValue()>v){
                v=et.getValue();
                indx=et.getKey();
            }
        }
        return indx;
    }
}