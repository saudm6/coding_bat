public List<String> noX(List<String> strings) {
    List<String> stringList = new ArrayList<>();

    for (String string: strings){
        stringList.add(string.replace("x", ""));
    }
    return stringList;
}
