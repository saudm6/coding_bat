public boolean xyBalance(String str) {
    if (!str.contains("x") && !str.contains("y")) return true;
    int y = str.lastIndexOf("y");
    int x = str.lastIndexOf("x");
    return y>x;
}
