public boolean dividesSelf(int n) {
    for (int m = n; m > 0; m /= 10) {
        int digit = m % 10;
        if (digit == 0 || n % digit != 0) {
            return false;
        }
    }
    return true;
}