class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(digitSum(i))count++;
        }      
        return count;
    }
    public boolean digitSum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            sum=sum+digit;
        }
        return sum%2==0;
    }
}