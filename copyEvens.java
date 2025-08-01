public int[] copyEvens(int[] nums, int count) {

    int[] final_num = new int[count];
    int num2 = 0;
    for (int num : nums) {
        if (num % 2 == 0) {
            final_num[num2++] = num;
            if (num2 == count) {
                break;
            }
        }
    }
    return final_num;
}
