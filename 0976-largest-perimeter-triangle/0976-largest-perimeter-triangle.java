class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int a = nums.length - 1; a >= 2 ; a--)
            if(isNonZeroAreaTriangle(nums[a],nums[a-1],nums[a-2]))
                return nums[a]+ nums[a-1] + nums[a-2];
        return 0;
    }
    static boolean isNonZeroAreaTriangle(int a, int b, int c) {
        return (a+b > c && b+c> a && a+c> b) ? true : false ;
    }
}