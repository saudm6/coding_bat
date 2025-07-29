public String repeatSeparator(String word, String sep, int count) {
    String str = "";
    for (int i = 0; i < count; i++){
        str += word;
        if (i >= count - 1){
            return str;
        }
        str += sep;
    }
    return str;
}
