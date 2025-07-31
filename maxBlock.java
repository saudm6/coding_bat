public int maxBlock(String str) {
    int count = 0;
    int max = 0;

    for (int i = 0; i < str.length(); i++){
        if (i > 0 && str.charAt(i) == str.charAt(i - 1)){
            count++;
        } else{
            count = 1;
        }

        if (count > max){
            max = count;
        }
    }
    return max;
}
