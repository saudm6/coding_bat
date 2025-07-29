public List<Integer> noNeg(List<Integer> nums) {
    List<Integer> integerList= new ArrayList<>();

    for (Integer num: nums){
        if (num < 0){
            continue;
        }
        integerList.add(num);
    }
    return integerList;
}
