public int userCompare(String aName, int aId, String bName, int bId) {
    int compare = aName.compareTo(bName);
    if (compare < 0) {
        return -1;
    }
    if (compare > 0) {
        return 1;
    }

    if (aId < bId) {
        return -1;
    }
    if (aId > bId) {
        return 1;
    }
    return 0;
}
