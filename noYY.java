public List<String> noYY(List<String> strings) {
    List<String> stringList= new ArrayList<>();

    for (String string: strings){
        if (string.endsWith("y") || string.contains("yy")){
            continue;
        }
        stringList.add(string + "y");
    }
    return stringList;
}
