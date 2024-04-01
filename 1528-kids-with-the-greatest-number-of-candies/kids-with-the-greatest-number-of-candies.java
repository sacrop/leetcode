class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest=0;
        for(int i=0;i<candies.length;i++){
            int j=candies[i];
            if(j>greatest){
                greatest=candies[i];
            }
        }
        List<Boolean> bool=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int k=candies[i];
            if(k+extraCandies>=greatest){
                bool.add(true);
            }
            else{
                bool.add(false);
            }
        }
        return bool;
    }
}