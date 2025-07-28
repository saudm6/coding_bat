public int[] makeMiddle(int[] nums) {
    int len_1 = (nums.length) / 2 - 1;
    int[] arr = new int[2];

    for (int i=0; i < 2; i++){
        arr[i] = nums[len_1 + i];
    }
    return arr;
}
