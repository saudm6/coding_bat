public List<String> moreY(List<String> strings) {
    List<String> stringList = new ArrayList<>();

    for (int i = 0 ; i < strings.size(); i++) {
        stringList.add("y" + strings.get(i) + "y");
    }
    return stringList;
}
