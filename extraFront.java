public String extraFront(String str) {
    String final_str = str;
    if (str.length() > 1){
        final_str = str.substring(0, 2);
    }
    return final_str + final_str + final_str;
}
