class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            stk.push(s.charAt(i));
        }
        for(int i=t.length()-1;i>=0;i--){
            if(stk.isEmpty()){
                return true;
            }
            if(stk.peek()==t.charAt(i)){
                stk.pop();
            }
        }
        if(stk.isEmpty()){
            return true;
        }
        return false;
    }
}