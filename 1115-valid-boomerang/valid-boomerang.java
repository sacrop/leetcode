class Solution {
    public boolean isBoomerang(int[][] points) {
        int x=points[0][0];
        int y=points[0][1];
        int x1=points[1][0];
        int y1=points[1][1];
        int x2=points[2][0];
        int y2=points[2][1];

        int slope=(y2-y1)*(x1-x);
        int slope1=(y1-y)*(x2-x1);
        return slope==slope1?false:true;
    }
}