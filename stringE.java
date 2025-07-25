public boolean stringE(String str) {
    int counter = 0;
    for (int i = 0; i < str.length(); i++){
        if (str.substring(i, i+1).equals("e")){
            counter +=1;
        }
    }
    if (counter > 0 && counter < 4){
        return true;
    }
    return false;
}
