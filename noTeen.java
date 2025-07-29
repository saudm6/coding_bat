public List<Integer> noTeen(List<Integer> nums) {
    List<Integer> integerList= new ArrayList<>();

    for (Integer num: nums){
        if (num >= 13 && num <= 19){
            continue;
        }
        integerList.add(num);
    }
    return integerList;
}