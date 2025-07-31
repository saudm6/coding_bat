public int[] pre4(int[] nums) {

    int position = nums.length;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) {
            position = i;
            break;
        }
    }

    int[] final_num = new int[position];

    for (int i = 0; i < position; i++) {
        final_num[i] = nums[i];
    }
    return final_num;
}
