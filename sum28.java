public boolean sum28(int[] nums) {
    int total = 0;
    for (int num : nums) {
        if (num == 2) {
            total += 2;
        }
    }
    return total == 8;
}
