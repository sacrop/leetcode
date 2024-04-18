class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk1=new Stack<>();
        Stack<Character> stk2=new Stack<>();
        for(int i=0;i<s.length();i++){
            stk1.push(s.charAt(i));
        }
        while(!stk1.isEmpty()){
            if(stk2.isEmpty()){
                stk2.push(stk1.pop());
            }
            else if(stk1.peek()==stk2.peek()){
                stk1.pop();
                stk2.pop();
            }
            else{
                stk2.push(stk1.pop());
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stk2.isEmpty()){
            sb.append(stk2.pop()+"");
        }
        return sb.toString();
    }
}