class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> intList = new HashMap<>();

        for(int num:nums){
            if(intList.containsKey(num)){
                return true;
            }else{
                intList.put(num,1);
            }
        }
        return false;
    }
}