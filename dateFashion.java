public int dateFashion(int you, int date) {
    if (you > 2 && date >=8 || you >= 8 && date > 2) return 2;
    else if (you > 2 && date > 2) return 1;
    return 0;
}
