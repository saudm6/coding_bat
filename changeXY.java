public String changeXY(String str) {

    if (str.isEmpty()) {
        return "";
    }
    char ch = str.charAt(0);
    char out = (ch == 'x') ? 'y' : ch;
    return out + changeXY(str.substring(1));
}
