public String stringSplosion(String str) {
    String final_str = "";
    for (int i = 0; i < str.length(); i++){
        final_str += str.substring(0, i + 1);
    }
    return final_str;
}
