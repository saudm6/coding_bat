public int[] pre4(int[] nums) {

    int pos = nums.length;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) {
            pos = i;
            break;
        }
    }

    int[] final_num = new int[pos];

    for (int i = 0; i < pos; i++) {
        final_num[i] = nums[i];
    }
    return final_num;
}
