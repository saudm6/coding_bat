public String zipZap(String str) {
    String str2 = "";
    for(int i=0; i < str.length(); i++){
        if (i+2 < str.length() && str.substring(i, i+1).equals("z") && str.substring(i+2, i+3).equals("p")){
            str2 += "zp";
            i = i+2;
        }
        else{
            str2 += str.substring(i, i+1);
        }
    }
    return str2;
}
