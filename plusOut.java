public String plusOut(String str, String word) {
    StringBuilder stringBuilder = new StringBuilder();
    int len = word.length();
    for (int i = 0; i < str.length(); i++){
        if (i+len <= str.length() && str.substring(i, i+len).equals(word)){
            stringBuilder.append(word);
            i = i+len - 1;
        }
        else {
            stringBuilder.append("+");
        }
    }
    return stringBuilder.toString();
}
