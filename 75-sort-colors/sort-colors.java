class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }
    public void quickSort(int[] nums,int low,int high){
        if(low>=high){
            return ;
        }
        int right=high;
        int left=low;
        int pivot=nums[high];
        while(left<right){
            while(left<right&&nums[left]<=pivot){
                left++;
            }
            while(left<right&&nums[right]>=pivot){
                right--;
            }
            swap(nums,left,right);
        }
        swap(nums,left,high);
        quickSort(nums,low,left-1);
        quickSort(nums,left+1,high);
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}