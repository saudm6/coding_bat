public String notReplace(String str) {
    String str2 = "";
    int len = str.length();

    for (int i = 0; i < len; i++){
        if (i + 1 < len && str.substring(i, i + 2).equals("is") && (i == 0 || !Character.isLetter(str.charAt(i - 1))) && (i + 2 == len || !Character.isLetter(str.charAt(i + 2)))) {
            str2 += "is not";
            i++;
            continue;
        }
        str2 += str.charAt(i);
    }
    return str2;
}
