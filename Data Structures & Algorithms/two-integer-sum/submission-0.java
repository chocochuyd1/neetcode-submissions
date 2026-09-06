class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        for (int i = 0; nums.length > i; i++) {
            temp = target - nums[i];
            for (int j = i + 1; nums.length > j; j++) {
                if (temp == nums[j]) {
                    return new int[] {i, j};
                }
            }
        } return new int[]{};
    }
}
