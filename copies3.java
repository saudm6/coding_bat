public List<String> copies3(List<String> strings) {
    List<String> stringList = new ArrayList<>();

    for (int i = 0 ; i < strings.size(); i++) {
        stringList.add(strings.get(i) + strings.get(i) + strings.get(i));
    }
    return stringList;
}
