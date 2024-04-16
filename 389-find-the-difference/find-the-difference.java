class Solution {
    public char findTheDifference(String s, String t) {
        int ch=0;
        for(char c:s.toCharArray()){
            ch=ch^c;
        }
        for(char c:t.toCharArray()){
            ch=ch^c;
        }
        return (char)ch;
       
    }
}