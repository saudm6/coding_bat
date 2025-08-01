public String[] mergeTwo(String[] a, String[] b, int n) {

    String[] final_num = new String[n];
    int num = 0;
    int num2 = 0;
    int num3 = 0;

    while (num3 < n) {
        String value_a = a[num];
        String value_b = b[num2];
        int cmp = value_a.compareTo(value_b);
        if (cmp < 0) {

            final_num[num3++] = value_a;
            num++;
        } else if (cmp > 0) {

            final_num[num3++] = value_b;
            num2++;
        } else {

            final_num[num3++] = value_a;
            num++;
            num2++;
        }
    }
    return final_num;
}
