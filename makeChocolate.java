public int makeChocolate(int small, int big, int goal) {
    int count = 0;

    for (int j = big; j >= 0; j--){
        for (int i = 0; i < small + 1; i++){
            if (i + (j * 5) == goal) return i;
        }
    }

    return -1;
}
