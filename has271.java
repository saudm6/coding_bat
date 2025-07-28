public boolean has271(int[] nums) {
    for (int i = 0; i < (nums.length - 2); i++) {
        int count = nums[i];
        if (nums[i + 1] == (count + 5) &&
                Math.abs(nums[i + 2] - (count - 1)) <= 2) {
            return true;
        }
    }
    return false;
}