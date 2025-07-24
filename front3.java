public String front3(String str) {
    if (str.length() > 2){
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }
    else{
        return str + str + str;
    }
}
