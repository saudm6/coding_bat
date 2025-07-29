public List<String> lower(List<String> strings) {
    List<String> stringList = new ArrayList<>();

    for (String string : strings) {
        stringList.add(string.toLowerCase());
    }
    return stringList;
}
