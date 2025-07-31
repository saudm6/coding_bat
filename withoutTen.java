public int[] withoutTen(int[] nums) {

    int position = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 10) {
            nums[position++] = nums[i];
        }
    }

    for (int i = position; i < nums.length; i++) {
        nums[i] = 0;
    }
    return nums;
}
