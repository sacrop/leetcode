class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasing =1;
        int decreasing =1;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                decreasing++;
                increasing=1;
            }
            else if(nums[i]<nums[i+1]){
                increasing++;
                decreasing=1;
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