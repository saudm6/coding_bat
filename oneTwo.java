public String oneTwo(String str) {
    String str2 = "";
    for (int i = 0; i < str.length()+ 1; i = i+3){
        if (i % 3 == 0 && i+3 <= str.length()){
            str2 += str.substring(i+1, i+2) + str.substring(i+2, i+3) + str.substring(i, i+1);
        }
        else{
            return str2;
        }
    }
    return str2;

}
