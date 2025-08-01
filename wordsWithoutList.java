public List wordsWithoutList(String[] words, int len) {
    
    List<String> final_word = new ArrayList<>();
    
    for (String word : words) {
        if (word.length() != len) {
            final_word.add(word);
        }
    }
    
    return final_word;
}
