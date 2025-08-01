public String pairStar(String str) {
    if (str.length() < 2) {
        return str;
    }

    char first = str.charAt(0);
    String rest  = str.substring(1);
    
    if (first == rest.charAt(0)) {
        return first + "*" + pairStar(rest);
    }
    return first + pairStar(rest);
}
