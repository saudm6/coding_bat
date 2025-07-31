public int sum67(int[] nums) {
    int total = 0;
    int lock = 0;
    for (int i = 0; i < nums.length; i++) {
        if (lock == 0 && nums[i] == 6) {
            lock = 1;
        }
        else if (lock == 1 && nums[i] == 7) {
            lock = 0;
        }
        else if (lock == 0) {
            total += nums[i];
        }
    }
    return total;
}
