public int[] fizzArray3(int start, int end) {
    
    int len = end - start;
    int[] total = new int[len];
    for (int i = 0; i < len; i++) {
        total[i] = start + i;
    }
    return total;
}
