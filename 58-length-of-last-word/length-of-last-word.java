class Solution {
    public int lengthOfLastWord(String s) {
        String[] sh=s.split(" ");
        int num=sh.length-1;
        String var=sh[num];

        return var.length();
    }
}