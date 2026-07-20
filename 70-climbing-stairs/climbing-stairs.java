class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int curr=2;
        int prev=1;
        for(int i=3;i<=n;i++){
            int next=curr;
            curr=curr+prev;
            prev=next;
        }
        return curr;
    }
}