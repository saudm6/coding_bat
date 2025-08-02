public String wordAppend(String[] strings) {
    Map<String, Integer> count = new HashMap<>();
    StringBuilder map = new StringBuilder();
    for (String string : strings) {
        int position = count.getOrDefault(string, 0) + 1;
        count.put(string, position);
        if (position % 2 == 0) {
            map.append(string);
        }
    }
    return map.toString();
}
