public int[] makePi() {
    int[] final_int = new int[3];
    String pi = String.valueOf((int) (Math.PI * 100));
    for (int i=0; i < 3 ; i++){
        final_int[i] = Integer.parseInt(pi.substring(i, i+1));
    }
    return final_int;
}
