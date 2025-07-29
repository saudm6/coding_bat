public List<String> noLong(List<String> strings) {
    List<String> stringList= new ArrayList<>();

    for (String string: strings){
        if (string.length() >=4){
            continue;
        }
        stringList.add(string);
    }
    return stringList;
}



