public int[] midThree(int[] nums) {
    int[] arr = new int [3];

    int middle = nums.length / 2 - 1;

    for (int i = 0; i < 3; i++){
        arr[i] = nums[middle + i];
    }

    return arr;
}
