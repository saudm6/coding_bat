public String mirrorEnds(String string) {
    String str = "";
    int len = string.length();

    for (int i=0; i < len; i++){
        if (string.charAt(i) == string.charAt(len - i - 1)){
            str += string.charAt(i);

        }
        else {
            break;
        }
    }
    return str;
}