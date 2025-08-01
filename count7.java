public int count7(int n) {

    if (n == 0) {
        return 0;
    }

    int last = n % 10;

    int rest = count7(n / 10);

    return (last == 7 ? 1 : 0) + rest;
}
