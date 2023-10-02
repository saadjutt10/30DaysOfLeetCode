class Solution {
    public int[] shuffle(int[] nums, int n) {
        int inc=1;
        for(int i =0 ; i<2*n ; i++){
            if(i%2!=0){
                int temp=nums[n+i-inc];
                int tempo=n+i-inc;
                for(int j=tempo ; j>i ; j--){
                    nums[j]=nums[j-1];
                }
                nums[i]=temp;
                inc++;
            }
        }
        return nums;
    }
}