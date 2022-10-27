#include<stdio.h>

int Pibo(int N);

int main() {

	int N;

	scanf("%d", &N);

	printf("%d\n", Pibo(N));
}

int Pibo(int N) {
	if (N > 1)
		return Pibo(N - 1) + Pibo(N - 2);
	else
		return N;
}