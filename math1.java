public List<Integer> math1(List<Integer> nums) {
    List<Integer> integerList = new ArrayList<>();

    for (Integer num : nums) {
        integerList.add((num + 1) * 10);
    }
    return integerList;
}
