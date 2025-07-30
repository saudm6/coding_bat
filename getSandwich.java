public String getSandwich(String str) {

    int start = str.indexOf("bread");
    int last = str.lastIndexOf("bread");
    if (start != last) {
        return str.substring(start + 5, last);
    }
    return "";
}
