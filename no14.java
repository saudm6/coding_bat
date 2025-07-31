public boolean no14(int[] nums) {
    int count1 = 0;
    int count4 = 0;
    for (int num : nums) {
        if (num == 1) count1++;
        if (num == 4) count4++;
    }
    if (count1 == 0 || count4 == 0) return true;
    return false;
}
