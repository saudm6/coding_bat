public int sumNumbers(String str) {
    String str2 = "";
    int total = 0;
    for (int i=0; i < str.length(); i++){
        if (Character.isDigit(str.charAt(i))){
            str2 += str.charAt(i);
        }
        else {
            if (!str2.isEmpty()){
                total += Integer.parseInt(str2);
                str2 = "";
            }
        }
    }
    if (!str2.isEmpty()) {
        total += Integer.parseInt(str2);
    }
    return total;
}