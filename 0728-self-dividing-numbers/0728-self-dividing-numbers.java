class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new LinkedList<>();
        for(int i =left ; i<=right ; i++){
            if(i<10){
                list.add(i);
                continue;
            }
            String numberStr = Integer.toString(i);
            if(!numberStr.contains("0")){
                Boolean check=true;
                for (char digitChar : numberStr.toCharArray()) {
                    int digit = Character.getNumericValue(digitChar);
                    if (digit == 0 || i % digit != 0) {
                        check= false; 
                        break;
                    }
                }
                if(check)
                    list.add(i);
            }
            
           
        }
        return list;
    }
}