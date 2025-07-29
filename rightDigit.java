public List<Integer> rightDigit(List<Integer> nums) {
    List<Integer> integerList = new ArrayList<>();

    for (int i = 0; i < nums.size(); i++){

        String count = String.valueOf(nums.get(i));

        for (int j = count.length() - 1; j > count.length() - 2; j--){
            integerList.add(Integer.valueOf(count.substring(j)));
        }
    }
    return integerList;
}
