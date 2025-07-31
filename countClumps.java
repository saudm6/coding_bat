public int countClumps(int[] nums) {
    
    int count = 0;
    int num2 = 0;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {

            if (num2 == 0) {
                count++;
                num2 = 1;
            }
        } else {

            num2 = 0;
        }
    }

    return count;
}
