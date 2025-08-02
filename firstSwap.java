public String[] firstSwap(String[] strings) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        char first = strings[i].charAt(0);
        if (map.containsKey(first)) {
            int last = map.get(first);
            if (last >= 0) {
                String value = strings[last];
                strings[last]    = strings[i];
                strings[i]       = value;
                map.put(first, -1);
            }
        } else {
            map.put(first, i);
        }
    }
    return strings;
}