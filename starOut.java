public String starOut(String str) {

    StringBuilder stringBuilder = new StringBuilder();
    int n = str.length();

    for (int i = 0; i < n; i++) {
        if (str.charAt(i) == '*') {
            continue;
        }
        if (i > 0 && str.charAt(i - 1) == '*') {
            continue;
        }
        if (i < n - 1 && str.charAt(i + 1) == '*') {
            continue;
        }
        stringBuilder.append(str.charAt(i));
    }
    return stringBuilder.toString();
}