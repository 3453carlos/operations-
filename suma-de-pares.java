    public static int sumaDePares(int[] d){
        if(d.length <= 0) return 0;
        int a = 0;
        for(int n:d) if(n % 2 == 0) a += n;
        return a;
    }
