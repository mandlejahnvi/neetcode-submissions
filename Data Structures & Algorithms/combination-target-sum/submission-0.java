class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, target, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(
        int index,
        int[] nums,
        int target,
        List<Integer> current,
        List<List<Integer>> result
    ) {

        // Found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Target went below 0
        if (target < 0) {
            return;
        }

        for (int i = index; i < nums.length; i++) {

            // Choose
            current.add(nums[i]);

            // i instead of i + 1
            // because we can reuse the same number
            backtrack(
                i,
                nums,
                target - nums[i],
                current,
                result
            );

            // Undo choice
            current.remove(current.size() - 1);
        }
    }
}