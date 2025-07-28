public int[] front11(int[] a, int[] b) {

    if (a.length == 0 && b.length  == 0){
        int[] arr = new int[0];
        return arr;
    }

    if (a.length == 0 && b.length > 0){
        int[] arr = new int[1];
        arr[0] = b[0];
        return arr;
    }
    else if (a.length > 0 && b.length == 0){
        int[] arr = new int[1];
        arr[0] = a[0];
        return arr;
    }
    else{
        int[] arr = new int[2];
        arr[0] = a[0];
        arr[1] = b[0];
        return arr;
    }
}