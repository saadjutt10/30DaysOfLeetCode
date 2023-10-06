class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i =0, j =mat[0].length-1; i<mat[0].length ;j--, i++){
            sum+=mat[i][i];
            if(i!=j)
            sum+=mat[i][j];
        }
        return sum;
    }
}