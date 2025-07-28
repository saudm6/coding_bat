public boolean cigarParty(int cigars, boolean isWeekend) {
    if (cigars > 39 && !isWeekend && cigars < 61) return true;
    else if (isWeekend && cigars > 39) return true;
    return false;
}
