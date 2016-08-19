    public static int mayorDeLosImpares(int[] d){
        if(d.length <= 0) return 0;
        int m = d[0];
        for(int x = d.length - 1; x >= 1; x--) if(d[x] >= m && d[x] % 2 != 0) m = d[x];
        return m;
    }
