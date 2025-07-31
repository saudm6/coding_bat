public int[] seriesUp(int n) {

    int total = n * (n + 1) / 2;
    int[] final_num = new int[total];
    int num = 0;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            final_num[num++] = j;
        }
    }
    return final_num;
}
