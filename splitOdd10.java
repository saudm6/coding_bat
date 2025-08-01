public boolean splitOdd10(int[] nums) {
    return splitOdd10_2(nums, 0, 0, 0);
}

private boolean splitOdd10_2(int[] nums, int index, int sum10Group, int sumOddGroup) {
    if (index >= nums.length) {
        return (sum10Group % 10 == 0) && (sumOddGroup % 2 == 1);
    }
    int v = nums[index];
    if (splitOdd10_2(nums, index + 1, sum10Group + v, sumOddGroup)) {
        return true;
    }
    if (splitOdd10_2(nums, index + 1, sum10Group, sumOddGroup + v)) {
        return true;
    }
    return false;
}