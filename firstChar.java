public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<>();
    for (String string : strings) {
        String word = string.substring(0, 1);
        map.put(word, map.getOrDefault(word, "") + string);
    }
    return map;
}
