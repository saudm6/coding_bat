public int[] copyEndy(int[] nums, int count) {
    int[] final_num = new int[count];
    int num2 = 0;
    for (int num : nums) {
        if (isEndy(num)) {
            final_num[num2++] = num;
            if (num2 == count) {
                break;
            }
        }
    }
    return final_num;
}

public boolean isEndy(int n) {
    return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
}
