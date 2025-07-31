public String withoutString(String base, String remove) {
    String str2 = "";
    int len = remove.length();

    for (int i = 0; i < base.length(); i++){
        if (i <= base.length() - len && base.substring(i, i+len).equalsIgnoreCase(remove)){
            i = i+len - 1;
        }
        else{
            str2 += base.substring(i,  i+1);
        }
    }
    return str2;
}