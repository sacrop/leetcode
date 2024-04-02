class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry:hmap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}