public int countHi(String str) {

    int count = 0;
    for (int i = 0; i < str.length(); i++){
        if (str.contains("hi")){
            str = str.replaceFirst("hi", "");
            count++;
        }
    }
    return count;
}