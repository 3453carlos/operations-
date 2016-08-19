    public static boolean predominanImpares(int[] datos){
        if(datos.length <= 0) return false;
        return !predominanPares(datos);
    }
