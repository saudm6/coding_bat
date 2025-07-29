public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
}

public int round10(int num){
    if (num >= 5){
        return ((num + 5)/10) * 10;
    }
    return num/10;
}