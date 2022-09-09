public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>prev = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            if(prev.containsKey(target-num))
                return new int[]{prev.get(target-num), i};
            prev.put(num, i);
        }
        return new int[]{-1, -1};
    }
}
