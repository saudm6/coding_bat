public String frontTimes(String str, int n) {
    String front = "";
    for (int i = 0; i < n; i++){
        if (str.length() < 3){
            front +=str;
        }
        else {
            front +=str.substring(0, 3);
        }
    }
    return front;
}
