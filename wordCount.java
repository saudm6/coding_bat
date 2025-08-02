public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    for (String string : strings) {
        map.put(string, map.getOrDefault(string, 0) + 1);
    }
    return map;
}
