public int[] squareUp(int n) {
    
    int[] final_num = new int[n * n];

    for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= i; j++) {
            final_num[(i - 1) * n + (n - j)] = j;
        }
    }
    
    return final_num;
}
