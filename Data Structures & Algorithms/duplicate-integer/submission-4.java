class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> intList = new HashMap<>();

        for(int num:nums){
            if(intList.containsKey(num)){
                intList.put(num,intList.get(num)+1);
                return true;
            }else{
                intList.put(num,1);
            }
        }
        return false;
    }
}