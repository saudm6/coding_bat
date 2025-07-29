public boolean twoAsOne(int a, int b, int c) {
    int num1 = a + b;
    int num2 = a + c;
    int num3 = b + c;
    if (num1 == c || num2 == b || num3 == a) return true;
    return false;
}
