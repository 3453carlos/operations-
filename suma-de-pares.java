    public static int sumaDePares(int[] datos){
        if(datos.length <= 0) return 0;
        int a = 0;
        for(int numero:datos) if(numero % 2 == 0) a += numero;
        return a;
    }
