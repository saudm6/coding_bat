public boolean equalIsNot(String str) {
    int count_not=0;
    int count_is=0;

    for (int i = 0; i <= str.length()-2; i++){
        if (i <= str.length() - 3 && str.substring(i, i+3).equals("not")){
            count_not++;
        }
        if (str.substring(i, i+2).equals("is")){
            count_is++;
        }
    }
    return count_is == count_not;
}
