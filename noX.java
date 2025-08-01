public String noX(String str) {

    if (str.isEmpty()) {
        return "";
    }
    
    char first = str.charAt(0);
    String rest = noX(str.substring(1));
    return (first == 'x') ? rest : first + rest;
}
