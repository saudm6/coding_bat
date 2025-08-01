public boolean splitArray(int[] nums) {
    return splitArrayHelper(nums, 0, 0, 0);
}

private boolean splitArrayHelper(int[] nums, int start, int sum1, int sum2) {

    if (start >= nums.length) {
        return sum1 == sum2;
    }
    int num = nums[start];

    if (splitArrayHelper(nums, start + 1, sum1 + num, sum2)) {
        return true;
    }

    if (splitArrayHelper(nums, start + 1, sum1, sum2 + num)) {
        return true;
    }

    return false;
}