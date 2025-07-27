public String lastChars(String a, String b) {

    if (a.isEmpty() && b.isEmpty()){
        return "@@";
    }
    else if (a.isEmpty()){
        a = "@";
    }
    else if (b.isEmpty()){
        b = "@";
    }
    return a.substring(0, 1) + b.substring(b.length()-1);
}
