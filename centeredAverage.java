publipublic int centeredAverage(int[] nums) {
    int check = nums.length;
    int total = 0;
    int min = nums[0];
    int max = nums[0];

    for (int i = 0; i < check; i++) {
        total += nums[i];
        min   = Math.min(min, nums[i]);
        max   = Math.max(max, nums[i]);
    }

    return (total - min - max) / (check - 2);

}
