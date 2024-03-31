class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> lst=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int begin=nums[i];
            int j=i;
            while(j<nums.length-1&&nums[j+1]==nums[j]+1){
                j++;
            }
            if(j==i){
                lst.add(nums[i]+"");
            }else{
                lst.add(begin+"->"+nums[j]);
            }
            i=j;
            i++;
        }
        return lst;
    }
}