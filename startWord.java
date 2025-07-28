public String startWord(String str, String word) {
    if (str.length() < word.length()) return "";
    
    String final_str = "";
    int counter = 0;

    for (int i=1; i < word.length(); i++){
        if (str.substring(i, i + 1).equals(word.substring(i, i + 1))){
            counter++;
        }
    }
    if (counter == word.length() - 1){
        return str.charAt(0) + word.substring(1);
    }
    return final_str;
}


