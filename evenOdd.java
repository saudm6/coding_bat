public int[] evenOdd(int[] nums) {

    int position = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 == 0) {
            int num = nums[position];
            nums[position] = nums[i];
            nums[i] = num;
            position++;
        }
    }

    return nums;
}
