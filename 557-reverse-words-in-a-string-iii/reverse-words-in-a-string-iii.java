class Solution {
    public String reverseWords(String s) {
        String[] ss=s.split(" ");
        StringBuilder ssb=new StringBuilder();
        for(int i=0;i<ss.length;i++){
            StringBuilder sb=new StringBuilder(ss[i]);
            sb.reverse();
            ssb.append(sb+" ");
        }
        return ssb.toString().trim();
    }
}