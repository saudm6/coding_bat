public List<Integer> square56(List<Integer> nums) {
    List<Integer> integerList= new ArrayList<>();

    for (Integer num: nums){
        int final_num = (num * num) + 10;
        String str = String.valueOf(final_num);
        if(str.endsWith("5") || str.endsWith("6")){
            continue;
        }
        integerList.add(final_num);
    }
    return integerList;
}
