public String stringX(String str) {
    String final_str = "";

    for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == 'x' && str.length() > 2 && i!=str.length()-1 && i!=0){
            continue;
        } else{
            final_str+=str.charAt(i);
        }
    }
    return final_str;
}
