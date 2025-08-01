public int scoreUp(String[] key, String[] answers) {

    int score = 0;

    for (int i = 0; i < key.length; i++) {
        String ans = answers[i];
        if (ans.equals("?")) {

            continue;
        }
        if (ans.equals(key[i])) {
            score += 4;
        } else {
            score -= 1;
        }
    }
    return score;
}