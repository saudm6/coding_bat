public int bigDiff(int[] nums) {
    int low = nums[0];
    int high = nums[0];

    for (int num : nums) {
        low = Math.min(low, num);
        high = Math.max(high, num);
    }
    return high - low;
}
