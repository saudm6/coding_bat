public boolean endOther(String a, String b) {
    String a2 = a.toLowerCase();
    String b2 = b.toLowerCase();
    if (a2.endsWith(b2) || b2.endsWith(a2)) return true;
    return false;
}
