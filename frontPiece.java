public int[] frontPiece(int[] nums) {
    if (nums.length < 2) return nums;

    int[] arr = new int[2];

    for (int i=0; i < 2; i++){
        arr[i] = nums[i];
    }

    return arr;
}
