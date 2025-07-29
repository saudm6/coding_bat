public boolean evenlySpaced(int a, int b, int c) {

    if (a != b && b != c || a == b && b == c){
        if (Math.abs(a - b) == Math.abs(a - c) || Math.abs(b - c) == Math.abs(a - c) || Math.abs(a - b) == Math.abs(b - c)) return true;
    }
    return false;
}
