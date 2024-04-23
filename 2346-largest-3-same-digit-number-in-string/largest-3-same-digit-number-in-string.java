class Solution {
    public String largestGoodInteger(String num) {
        int i=0;
        int j=0;
        String s="";
        while(i<num.length()-1&&j<num.length()){
            j=i+1;
            int count=1;
            while(i<num.length()-1&&j<num.length()&&num.charAt(i)==num.charAt(j)&&count<3){
                j++;
                count++;
            }
            System.out.println(num.charAt(i)+" "+count);
            if(count==3&&s.compareTo(num.substring(i,j))<0){
                s=num.substring(i,j);
            }
            i=j;
        }
        return s;
    }
}