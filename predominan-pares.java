    public static boolean predominanPares(int[] d){
        if(d.length <= 0) return false;
        int a = 0,
            b = 0;
        for(int n:d) if(n % 2 == 0) a++; else b++;
        return a >= b;
    }
