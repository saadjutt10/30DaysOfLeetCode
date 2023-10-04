class Solution {
    public int arraySign(int[] nums) {
        if( nums.length==0)
            return 0;
        int product=1;
        for (int num:nums){
            if(num==0)
                return 0;
            product=product*num;
            product = product >=1 ? 1: -1;
                
        }
    return product;
          // return  product >0 ?  1 :  -1;
    }
}