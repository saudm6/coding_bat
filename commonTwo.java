public int commonTwo(String[] a, String[] b) {

    int num = 0;
    int num2 = 0;
    int count = 0;

    while (num < a.length && num2 < b.length) {
        int compare = a[num].compareTo(b[num2]);
        if (compare == 0) {

            if (num == 0 || !a[num].equals(a[num - 1])) {
                count++;
            }
            num++;
            num2++;
        } else if (compare < 0) {
            num++;
        } else {
            num2++;
        }
    }
    return count;
}