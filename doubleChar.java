public String doubleChar(String str) {
    String str2 = "";
    for (int i = 0; i < str.length(); i++){
        str2 += str.substring(i, i+1) + str.substring(i, i+1);
    }
    return str2;
}
