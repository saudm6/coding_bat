public String mixString(String a, String b) {
    StringBuilder str = new StringBuilder();

    int numMax = Math.max(a.length(), b.length());
    int numMin = Math.min(a.length(), b.length());

    int count = 0;

    if (a.length() == numMin){
        count = 1;
    }


    for (int i = 0; i < numMin; i++){

        if (count == 1){
            str.append(a.charAt(i));
            str.append(b.charAt(i));
        }
        else{
            str.append(a.charAt(i));
            str.append(b.charAt(i));
        }
    }

    if (numMin == 0 && count == 1){
        return b;
    }
    if (numMin == 0 && count == 0){
        return a;
    }
    if (count == 1) {
        str.append(b.substring(numMin));
    }
    else {
        str.append(a.substring(numMin));
    }
    return str.toString();
}
