    public static int menorDeLosPares(int[] datos){
        if(datos.length <= 0) return 0;
        int menor = datos[0];
        for(int numero: datos) if(numero <= menor && numero % 2 == 0) menor = numero;
        return menor;
    }
