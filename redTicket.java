public int redTicket(int a, int b, int c) {
    if (b != a && c !=a) return 1;
    if (a == 2 && b == 2 && c == 2) return 10;
    if (a == b & b == c && a == c) return 5;
    return 0;
}
