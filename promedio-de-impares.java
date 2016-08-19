    public static float promedioDeImpares(int[] d){
        if(d.length <= 0) return 0.0F;
        int a = 0;
        for(int n:d) if(n % 2 != 0) a += n;
        return a / d.length;
    }
