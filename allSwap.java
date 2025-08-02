public String[] allSwap(String[] strings) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        char word = strings[i].charAt(0);
        if (map.containsKey(word)) {
            int j = map.get(word);
            String value = strings[j];
            strings[j] = strings[i];
            strings[i] = value;
            map.remove(word);
        } else {
            map.put(word, i);
        }
    }
    return strings;
}
