    public static boolean predominanPares(int[] datos){
        int contadorPares = 0,
            contadorImpares = 0;
        for(int numero: datos) if(numero % 2 == 0) contadorPares++; else contadorImpares++;
        return contadorPares >= contadorImpares;
    }
