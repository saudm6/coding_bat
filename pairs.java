public Map<String, String> pairs(String[] strings) {

    Map<String, String> map = new HashMap<>();
    for (String string : strings) {
        String num = string.substring(0, 1);
        String num2 = string.substring(string.length() - 1);
        map.put(num, num2);
    }
    return map;
}
