class Solution {
    public int countSegments(String s) {
         if (s == null || s.length() == 0) {
            return 0;
        }
        String[] segments = s.split(" ");
        int count = 0;
        for (String segment : segments) {
            if (!segment.isEmpty()) {
                count++;
            }
        }    
        return count;
    }
}