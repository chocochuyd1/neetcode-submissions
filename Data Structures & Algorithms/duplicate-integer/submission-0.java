class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();
        
        for (int num : nums){
            if(!list.contains(num)){
                list.add(num);
            }else{
                return true;
            }
        }
        return false;
    }
}