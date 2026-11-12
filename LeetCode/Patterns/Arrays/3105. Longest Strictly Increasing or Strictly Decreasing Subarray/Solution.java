class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasing =1;
        int decreasing =1;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                decreasing++;
            }
            else if(nums[i]<nums[i+1]){
                increasing++;
            }
            else{
                decreasing=1;
                increasing=1;
            }
            count=Math.max(count,Math.max(increasing,decreasing));
        }
        return count;
    }
}