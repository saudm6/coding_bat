public int scoresAverage(int[] scores) {
    int mid = scores.length / 2;
    int avg1 = average(scores, 0, mid - 1);
    int avg2 = average(scores, mid, scores.length - 1);
    return Math.max(avg1, avg2);
}

public int average(int[] scores, int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
        sum += scores[i];
    }
    return sum / (end - start + 1);
}
