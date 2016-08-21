public static long potenciaRecursiva(long numero, long potencia){
	return (potencia <= 0) ? 1 : numero * potenciaRecursiva(numero, potencia - 1);
}
