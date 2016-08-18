    public static String multiplosDe(int[] datos, int multiplo){
        String r = "";
        for(int n:datos) if(n % multiplo == 0) r += String.valueOf(n) + "\n";
        return r;
    }
