public int countYZ(String str) {
    int count  = 0;

    str = str.toLowerCase();
    for (int i=0; i < str.length(); i++){
        if (str.substring(i, i + 1).equals("z") || str.substring(i, i +1).equals("y")){
            if (i + 1 == str.length() || !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }
    }
    return count;
}
