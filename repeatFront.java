public String repeatFront(String str, int n) {
    String str2 = "";
    for (int i = 0; i < n; i++){
        str2 += str.substring(0, n-i);
    }
    return str2;
}
