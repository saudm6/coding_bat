public boolean squirrelPlay(int temp, boolean isSummer) {
    if (temp > 59 && temp < 91 && !isSummer) return true;
    if (temp > 59 && temp < 101 && isSummer) return true;
    return false;
}
