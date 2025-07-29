public boolean catDog(String str) {
    int countCat = 0;
    int countDog = 0;

    for (int i = 0; i < str.length(); i++){
        if (str.contains("cat")){
            str = str.replaceFirst("cat", "");
            countCat++;
        }
    }
    for (int i = 0; i < str.length(); i++){
        if (str.contains("dog")){
            str = str.replaceFirst("dog", "");
            countDog++;
        }
    }
    return countCat == countDog;
}
