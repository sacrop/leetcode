class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hst1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hst1.add(nums1[i]);
        }
        HashSet<Integer> hst2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            hst2.add(nums2[i]);
        }
        List<List<Integer>> ls=new ArrayList<>();
        ls.add(new ArrayList<>());
        ls.add(new ArrayList<>());
        for(Integer i:hst1){
            if(!hst2.contains(i)){
                ls.get(0).add(i);
            }
        }
        for(Integer i:hst2){
            if(!hst1.contains(i)){
                ls.get(1).add(i);
            }
        }
        return ls;
    }
}