public String sameEnds(String string) {
    String str = "";

    int len = string.length();

    for (int i=1; i <= len/2; i++){
        if (string.substring(0, i).equals(string.substring(len-i))){
            str = string.substring(0, i);
        }
    }
    return str;

}
