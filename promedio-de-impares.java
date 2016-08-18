    public static float promedioDeImpares(int[] datos){
        int a = 0;
        for(int numero:datos) if(numero % 2 != 0) a += numero;
        return a / datos.length;
    }
