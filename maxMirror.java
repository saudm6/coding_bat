public int maxMirror(int[] nums) {

    int max = 0;
    int n = nums.length;

    for (int i = 0; i < n; i++) {

        for (int j = n - 1; j >= 0; j--) {
            int length = 0;

            for (int k = 0; i + k < n && j - k >= 0; k++) {
                if (nums[i + k] == nums[j - k]) {
                    length++;
                } else {
                    break;
                }
            }

            if (length > max) {
                max = length;
            }
        }
    }

    return max;
}