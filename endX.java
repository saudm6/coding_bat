public String endX(String str) {
    if (str.isEmpty()) {
        return "";
    }

    char first = str.charAt(0);
    String rest  = endX(str.substring(1));

    if (first == 'x') {
        return rest + first;
    } else {
        return first + rest;
    }
}
