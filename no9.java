public List<Integer> no9(List<Integer> nums) {
    List<Integer> integerList= new ArrayList<>();

    for (Integer num: nums){
        if (num % 10 == 9){
            continue;
        }
        integerList.add(num);
    }
    return integerList;
}
