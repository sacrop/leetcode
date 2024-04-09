class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            while(!isVowel(ch[i])&&i<j){
                i++;
            }
            while(!isVowel(ch[j])&&i<j){
                j--;
            }
            if(isVowel(ch[i])&&isVowel(ch[j])&&i<j){
                swap(ch,i,j);
            }
            i++;
            j--;
        }
        String ss=new String(ch);
        return ss;
        
    }
    public void swap(char[] ch,int i,int j){
        char c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
    }
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}