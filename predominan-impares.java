    public static boolean predominanImpares(int[] datos){
        if(datos.length <= 0) return 0;
        return !predominanPares(datos);
    }
