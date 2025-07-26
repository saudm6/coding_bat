public String stringBits(String str) {
    String final_str = "";
    for (int i = 0; i < str.length(); i +=2){
        final_str+=str.charAt(i);
    }
    return final_str;
}
