public int[] rotateLeft3(int[] nums) {
    int[] numbers = new int[3];
    numbers[0] = nums[1];
    numbers[1] = nums[2];
    numbers[2] = nums[0];
    return numbers;
}