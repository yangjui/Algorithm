#include<stdio.h>

int factorial(int N);

int main() {
	
	int N = 0;

	scanf("%d", &N);

	printf("%d\n", factorial(N));
}

int factorial(int N) {
	int result = 1;

	if (N == 0)
		return 1;
	return N*factorial(N-1);
}