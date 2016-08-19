    public static boolean predominanPares(int[] datos){
        if(datos.length <= 0) return false;
        int contadorPares = 0,
            contadorImpares = 0;
        for(int numero: datos) if(numero % 2 == 0) contadorPares++; else contadorImpares++;
        return contadorPares >= contadorImpares;
    }
