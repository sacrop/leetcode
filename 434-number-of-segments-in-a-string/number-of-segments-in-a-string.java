class Solution {
    public int countSegments(String s) {
         if (s == null || s.length() == 0) {
            return 0; // Return 0 for empty string
        }
        
        // Split the string based on spaces
        String[] segments = s.split(" ");
        
        int count = 0;
        // Count non-empty segments
        for (String segment : segments) {
            if (!segment.isEmpty()) {
                count++;
            }
        }
        
        return count;
    }
}