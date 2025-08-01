public boolean split53(int[] nums) {
    return split53_2(nums, 0, 0, 0);
}


private boolean split53_2(int[] nums, int index, int sum5Group, int sum3Group) {
    if (index >= nums.length) {
        return sum5Group == sum3Group;
    }
    int num = nums[index];

    if (num % 5 == 0) {
        return split53_2(nums, index + 1, sum5Group + num, sum3Group);
    }

    if (num % 3 == 0) {
        return split53_2(nums, index + 1, sum5Group, sum3Group + num);
    }
    if (split53_2(nums, index + 1, sum5Group + num, sum3Group)) {
        return true;
    }
    return split53_2(nums, index + 1, sum5Group, sum3Group + num);
}