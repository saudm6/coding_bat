public boolean makeBricks(int small, int big, int goal) {

    for (int i = 0; i < big + 1; i++){
        for (int j = 0; j < small + 1; j++){
            if (j + i * 5 == goal) return true;
        }
    }
    return false;
}
