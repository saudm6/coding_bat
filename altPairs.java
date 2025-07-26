public String altPairs(String str) {
    String final_str = "";
    for (int i=0; i < str.length(); i+=4){
        if (i == str.length() - 1){
            final_str += str.substring(i);
        }
        else {
            final_str += str.substring(i, i+2);
        }
    }
    return final_str;
}
