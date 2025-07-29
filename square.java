public List<Integer> square(List<Integer> nums) {
    List<Integer> integerList = new ArrayList<>();

    for (Integer num : nums) {
        integerList.add(num * num);
    }
    return integerList;
}

