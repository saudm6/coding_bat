public class post4 {
    int last_position = -1;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) {
            last_position = i;
        }
    }

    int len = nums.length - last_position - 1;

    int[] final_num = new int[len];
    for (int i = 0; i < len; i++) {
        final_num[i] = nums[last_position + 1 + i];
    }
    return final_num;
}
