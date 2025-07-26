public int last2(String str) {
    int counter = 0;
    int total_counter = 0;
    if (str.length() < 2){
        return 0;
    }
    else{
        String last_string = str.substring(str.length()-2);
        for (int i = 0; i < str.length() -2; i++){
            String final_str = str.substring(i, i+2);
            if (Objects.equals(final_str, last_string)){
                counter += 1;
            }
            if (total_counter < counter){
                total_counter = counter;
            }
        }
        return total_counter;
    }
}
