class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> lst=new ArrayList<>();
        int len1=nums1.length;
        int len2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<len1&&j<len2){
            if(nums1[i]==nums2[j]){
                lst.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

       int[] arr=new int[lst.size()];
       int k=0;
       for(int m:lst){
        arr[k]=m;
        k++;
       }
       return arr;
    }
}