public int caughtSpeeding(int speed, boolean isBirthday) {
    if (speed  > 80 && !isBirthday) return 2;
    if (speed  > 85 && isBirthday) return 2;
    if (speed  > 60 && !isBirthday) return 1;
    if (speed  > 65 && isBirthday) return 1;
    return 0;
}
