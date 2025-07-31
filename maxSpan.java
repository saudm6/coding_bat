public int maxSpan(int[] nums) {

    int max = 0;

    for (int i = 0; i < nums.length; i++) {

        for (int j = nums.length - 1; j >= i; j--) {
            if (nums[j] == nums[i]) {

                int span = j - i + 1;
                if (span > max) {
                    max = span;
                }

                break;
            }
        }
    }
    return max;
}