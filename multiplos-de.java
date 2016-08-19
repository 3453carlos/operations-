    public static String multiplosDe(int[] d, int m){
        if(d.length <= 0 || m <= 0) return "No válido";
        String r = "";
        for(int n:d) if(n % m == 0) r += String.valueOf(n) + "\n";
        return r;
    }
