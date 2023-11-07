class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
          int n = dist.length;
        float[] time_to_city = new float[n];
        
        for (int i = 0; i < n; i++) {
            time_to_city[i] = (float)dist[i] / speed[i];
        }
        
        Arrays.sort(time_to_city);
        
        for (int i = 0; i < n; i++) {
            if (time_to_city[i] <= i) {
                return i;
            }
        }
        
        return n;
    }
}