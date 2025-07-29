public boolean prefixAgain(String str, int n) {
    for (int i = n; i <= str.length() - n; i++){
        if (str.substring(0, n).equals(str.substring(i, n+i))){
            return true;
        }
    }
    return false;
}
