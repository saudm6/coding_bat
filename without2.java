public String without2(String str) {
    if (str.length() == 1){
        return str;
    }
    if (str.length()  < 2){
        return "";
    }
    String first =  str.substring(0, 2);
    String last = str.substring(str.length() - 2);
    if (first.equals(last)){
        return str.substring(2);
    }
    return str;
}

