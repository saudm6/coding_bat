public String wordEnds(String str, String word) {
    StringBuilder stringBuilder = new StringBuilder();

    int len = word.length();

    for (int i = 0; i <= str.length() - len; i++){
        if (str.substring(i, i+len).equals(word)){
            if (i>0){
                stringBuilder.append(str.substring(i-1, i));
            }

            if (i + len < str.length()){
                stringBuilder.append(str.substring(i+len, i+len +1));
            }
        }
    }
    return stringBuilder.toString();

}