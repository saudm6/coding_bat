public int[] plusTwo(int[] a, int[] b) {
    int[] arr = new int [4];

    for (int i=0; i < 2; i++){
        arr[i] = a[i];
    }
    for (int i=2; i < 4; i++){
        arr[i] = b[i - 2];
    }
    return arr;
}
