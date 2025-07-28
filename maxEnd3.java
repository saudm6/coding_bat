public int[] maxEnd3(int[] nums) {
    int number = Math.max(nums[0], nums[2]);
    int[] arr = new int[3];
    for (int i = 0; i < nums.length; i++){
        arr[i] = number;
    }
    return arr;
}
