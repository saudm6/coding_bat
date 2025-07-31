public int[] fix34(int[] nums) {

    int j = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            for (; j < nums.length; j++) {
                if (nums[j] == 4) {

                    int tmp     = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j]     = tmp;
                    j++;
                    break;
                }
            }
        }
    }

    return nums;
}
