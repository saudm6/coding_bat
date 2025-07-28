public boolean in1To10(int n, boolean outsideMode) {
    if (n > 0 && n < 11 && !outsideMode) return true;
    else if(n <= 1 && outsideMode || n >= 10 && outsideMode) return true;
    return false;
}
