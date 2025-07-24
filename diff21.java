public int diff21(int n) {
    if (n < 22){
        return 21 - n;
    }
    else {
        return Math.abs(2 * (21 - n));
    }
}
