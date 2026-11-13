class Solution {
    public int romanToInt(String s) {
        int num=0;
        Map<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i<ch.length-1&& mp.get(ch[i])<mp.get(ch[i+1])){
                num-=mp.get(ch[i]);
            }
            else{
                num+=mp.get(ch[i]);
            }
        }
        return num;
    }
}