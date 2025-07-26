public boolean arrayFront9(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++){
        if (nums[i] == 9 && i < 4){
            count++;
        }
    }
    if (count !=0){
        return true;
    }
    return false;
}
