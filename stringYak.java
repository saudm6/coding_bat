public String stringYak(String str) {
    String final_string = "";
    for (int i = 0; i < str.length(); i++) {
        if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
            i =  i + 2;
        }
        else {
            final_string = final_string + str.charAt(i);
        }
    }

    return final_string;
}