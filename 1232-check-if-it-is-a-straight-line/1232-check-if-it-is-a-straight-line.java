class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // m= y2-y1 / x2-x1
         // System.out.println("General slope is :"+slope);
        for(int i=2;i<coordinates.length;i++){
            int x=coordinates[i][0];
            int y= coordinates[i][1];
            if((coordinates[1][1]-coordinates[0][1])*(x-coordinates[0][0])!= (y-coordinates[0][1])*(coordinates[1][0]-coordinates[0][0])) return false;
        }
        return true;
    }
}