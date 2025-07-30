public boolean xyzMiddle(String str) {
    StringBuilder stringBuilder = new StringBuilder();
    int start = str.indexOf("xyz");
    int end = str.indexOf("z");
    int right = str.length() - end;

    for (int i = 0; i <= str.length() - 3; i++){
        if (str.substring(i, i + 3).equals("xyz")){
            int end2 = i+3;
            int len = str.length() - end2;
            if (Math.abs(i - len) <= 1){
                return true;
            }
        }
    }
    return false;
}
