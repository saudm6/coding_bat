public List<String> no34(List<String> strings) {
    List<String> stringList= new ArrayList<>();

    for (String string: strings){
        if (string.length() == 4 || string.length() == 3){
            continue;
        }
        stringList.add(string);
    }
    return stringList;
}
