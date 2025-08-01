public int count8(int n) {

    if (n == 0) {
        return 0;
    }
    int num = n % 10;
    int num2 = n / 10;
    if (num == 8) {

        if (num2 % 10 == 8) {
            return 2 + count8(num2);
        } else {
            return 1 + count8(num2);
        }
    }

    return count8(num2);
}