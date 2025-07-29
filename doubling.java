public List<Integer> doubling(List<Integer> nums) {
    List<Integer> integerList = new ArrayList<>();

    for (Integer num : nums) {
        integerList.add(num * 2);
    }
    return integerList;
}