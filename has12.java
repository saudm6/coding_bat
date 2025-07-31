public boolean has12(int[] nums) {

    int count1 = 0;
    for (int num : nums) {
        if (num == 1) {
            count1++;
        } else if (num == 2 && count1 > 0) {
            return true;
        }
    }
    return false;
}
