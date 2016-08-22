public static long multiplicacionRecursivaFea(long a, long b){
	if(a == 0 || b == 0) return 0;
	else{
		if(b > 0){
			if(b > a) return b + multiplicacionRecursiva(b, a - 1);
			else return a + multiplicacionRecursiva(a, b - 1);
		}else{
			if(b > a) return -multiplicacionRecursiva(b, -a);
			else return -multiplicacionRecursiva(a, -b);
		}
	}
}
