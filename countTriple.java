public int countTriple(String str) {

    int total = 0;
    for (int i = 0; i <= str.length() - 3; i++){

        String st2 = str.substring(i, i+1);

        if (st2.equals(str.substring(i+1, i+2)) && st2.equals(str.substring(i+2, i+3))) {
            total++;
        }
    }
    return total;

}
