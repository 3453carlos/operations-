    public static int mayorDeLosImpares(int[] datos){
        if(datos.length <= 0) return 0;
        int mayor = datos[0];
        for(int numero: datos) if(numero >= mayor && numero % 2 != 0) mayor = numero;
        return mayor;
    } 
