public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isMorning && isMom && !isAsleep) return true;
    if (isMorning && !isMom && !isAsleep) return false;
    if (!isMorning && !isAsleep) return true;
    return false;
}