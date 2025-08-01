public boolean groupSumClump(int start, int[] nums, int target) {

    if (start >= nums.length) {
        return target == 0;
    }

    int count = 1;
    int num = nums[start];
    while (start + count < nums.length && nums[start + count] == num) {
        count++;
    }
    int clumpSum = num * count;
    int nextIndex = start + count;

    if (groupSumClump(nextIndex, nums, target - clumpSum)) {
        return true;
    }

    if (groupSumClump(nextIndex, nums, target)) {
        return true;
    }

    return false;
}
