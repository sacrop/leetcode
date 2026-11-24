class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int val=0;
        while(x>0){
            int var=x%10;
            val=val*10+var;
            x=x/10;
        }
        return (num==val)?true:false;
    }
}