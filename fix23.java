public int[] fix23(int[] nums) {
    int[] arr = new int[3];
    for (int i=0; i < nums.length - 1; i++){
        if(nums[i] == 2 && nums[i+1] == 3){
            arr[i+1] = 0;
            arr[i] = nums[i];
        }
        else{
            if (i+1 == nums.length - 1){
                arr[i+1] = nums[i+1];
            }
            if (nums[1] != 3){
                arr[i] = nums[i];
            }else{
                nums[i] = 0;
            }
        }
    }
    return arr;
}