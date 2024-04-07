class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=encrypt(nums[i]);
        }
        return sum;
    }
    public int encrypt(int x){
        int n=0;
        int count=0;
        while(x>0){
            int val=x%10;
            if(val>n){
                n=val;
            }
            x=x/10;
            count=count*10+1;
        }   
        return n*count;
    }
}