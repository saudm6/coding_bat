public int maxTriple(int[] nums) {
    int high = nums[0];

    if(nums[nums.length/2] > high){
        high = nums[nums.length/2];
    }

    if (nums[nums.length - 1] > high){
        high = nums[nums.length - 1];
    }

    return high;
}

