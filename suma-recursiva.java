public static long sumaRecursiva(long inicio, long fin){
	return (inicio > fin) ? 0 : inicio + sumaRecursiva(inicio + 1, fin);
}
