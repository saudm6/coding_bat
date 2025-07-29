public int blackjack(int a, int b) {
    int diff_a = Math.abs(a - 21);
    int diff_b = Math.abs(b - 21);

    if (a <= 21 && b <= 21){
        if (Math.min(diff_a, diff_b) == diff_a) return a;
        return b;
    }

    else if(a <= 21 || b <= 21){
        return Math.min(a, b);
    }
    return 0;
}
    