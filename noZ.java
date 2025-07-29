public List<String> noZ(List<String> strings) {
    List<String> stringList= new ArrayList<>();

    for (String string: strings){
        if (string.contains("z")){
            continue;
        }
        stringList.add(string);
    }
    return stringList;
}
