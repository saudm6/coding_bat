public int[] zeroMax(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            int odd = 0;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % 2 != 0 && nums[j] > odd) {
                    odd = nums[j];
                }
            }
            nums[i] = odd;
        }
    }
    return nums;
}
