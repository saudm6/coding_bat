public String conCat(String a, String b) {
    if (a.isEmpty()){
        return b;
    } else if(b.isEmpty()){
        return a;
    }
    if (a.charAt(a.length()-1) == b.charAt(0)){
        return a + b.substring(1);
    }
    return a + b;
}
