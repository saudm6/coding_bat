public String front22(String str) {
    if (str.length() < 2){
        return str + str + str;
    }
    else {
        String mid = str.substring(0,2);
        return mid + str + mid;
    }
}
