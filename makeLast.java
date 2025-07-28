public int[] makeLast(int[] nums) {

    int total_length = nums.length * 2;
    int[] arr = new int[total_length];

    arr[total_length - 1] = nums[nums.length-1];
    return arr;
}