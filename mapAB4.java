public Map<String, String> mapAB4(Map<String, String> map) {

    if (map.containsKey("a") && map.containsKey("b")) {
        String a = map.get("a");
        String b = map.get("b");

        if (a.length() == b.length()) {
            // same length → clear both
            map.put("a", "");
            map.put("b", "");

        } else if (a.length() > b.length()) {
            // a is longer → set c to a's value
            map.put("c", a);
            
        } else {
            // b is longer → set c to b's value
            map.put("c", b);
        }
    }
    return map;
}
