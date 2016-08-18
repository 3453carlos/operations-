    public static String multiplosDe(int[] datos, int multiplo){
        if(datos.length <= 0) return 0;
        String r = "";
        for(int n:datos) if(n % multiplo == 0) r += String.valueOf(n) + "\n";
        return r;
    }
