public int[] copyEvens(int[] nums, int count) {

    int[] original = new int[count];
    int num2 = 0;
    for (int num : nums) {
        if (num % 2 == 0) {
            original[num2++] = num;
            if (num2 == count) {
                break;
            }
        }
    }
    return original;
}
