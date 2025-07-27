public String makeOutWord(String out, String word) {
    int half = out.length()/2;
    return out.substring(0, half) + word + out.substring(half);
}
