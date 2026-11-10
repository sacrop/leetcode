class Solution {
    public String reverseWords(String s) {
        int i=0;
        char[] ch=s.toCharArray();
        while (i<ch.length){
            int j=i;
            while(j<ch.length && ch[j]!=' '){
                j++;
            }
            int left=i;
            int right=j-1;
            while(left<right){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            i=j+1;
        }
        return new String(ch);
    }
}