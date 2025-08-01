public boolean groupSum5(int start, int[] nums, int target) {

    if (start >= nums.length) {
        return target == 0;
    }

    int num = nums[start];

    if (num % 5 == 0) {
        int newTarget = target - num;
        if (start + 1 < nums.length && nums[start + 1] == 1) {
            return groupSum5(start + 2, nums, newTarget);
        } else {
            return groupSum5(start + 1, nums, newTarget);
        }
    }

    if (groupSum5(start + 1, nums, target - num)) {
        return true;
    }
    
    return groupSum5(start + 1, nums, target);
}
