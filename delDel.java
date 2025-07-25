public String delDel(String str) {
    if (str.startsWith("del", 1)){
        return str.replaceFirst("del", "");
    }
    else {
        return str;
    }
}
