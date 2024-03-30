class Solution {
    public int findClosestNumber(int[] nums) {
        int distance=Integer.MAX_VALUE;
        int num=0;
        for(int i:nums){
            if(Math.abs(i)<distance){
                distance=Math.abs(i);
                num=i;
            }
            else if(Math.abs(i)==distance&&i>num){
                num=i;
            }
        }
        return num;
    }
}