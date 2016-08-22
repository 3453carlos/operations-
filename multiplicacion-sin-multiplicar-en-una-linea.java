public static long multiplicacionRecursiva(long a, long b){
	return (a == 0 || b == 0) ? 0 :  (b > 0) ? (b > a) ? b + multiplicacionRecursiva(b, a - 1) : a + multiplicacionRecursiva(a, b - 1)  : (b > a) ? -multiplicacionRecursiva(b, -a) : -multiplicacionRecursiva(a, -b);
}
