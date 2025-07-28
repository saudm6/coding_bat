public boolean unlucky1(int[] nums) {
    int[] arr = new int[2];
    for (int i = 0; i < nums.length - 1; i++){
        if (nums[i] == 1 && nums[i + 1] == 3){
            return true;
        }
    }
    return false;
}
