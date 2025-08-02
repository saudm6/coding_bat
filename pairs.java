public Map<String, String> pairs(String[] strings) {

    Map<String, String> map = new HashMap<>();
    for (String string : strings) {
        String word = string.substring(0, 1);
        String word2 = string.substring(string.length() - 1);
        map.put(word, word2);
    }
    return map;
}
