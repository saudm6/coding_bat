public int sumDigits(String str) {
    int total = 0;

    for (int i=0; i < str.length(); i++){
        if (Character.isDigit(str.charAt(i))){
            total += Integer.parseInt(str.substring(i, i+1));
        }
    }
    return total;

}
