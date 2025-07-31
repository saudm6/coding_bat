public String[] fizzBuzz(int start, int end) {

    String[] str = new String[end - start];

    for (int i = 0; i < str.length; i++) {
        int val = start + i;
        if (val % 15 == 0) {
            str[i] = "FizzBuzz";
        } else if (val % 3 == 0) {
            str[i] = "Fizz";
        } else if (val % 5 == 0) {
            str[i] = "Buzz";
        } else {
            str[i] = String.valueOf(val);
        }
    }

    return str;
}
