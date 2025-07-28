public int[] biggerTwo(int[] a, int[] b) {
    int total_1 = 0;
    int total_2 = 0;
    for (int i=0; i < 2; i++){
        total_1 += a[i];
        total_2 += b[i];
    }
    if (total_1 >= total_2){
        return a;
    }
    return b;
}