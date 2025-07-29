public List<Integer> two2(List<Integer> nums) {
    List<Integer> integerList= new ArrayList<>();

    for (int i = 0; i < nums.size(); i++){
        String s = String.valueOf(nums.get(i) * 2);
        if (s.endsWith("2")){
            continue;
        }
        integerList.add(nums.get(i) * 2);
    }
    return integerList;
}
