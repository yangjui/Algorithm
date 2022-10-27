#include<stdio.h>

int main() {
	int a, b; //물건 별 가격과 개수
	int sum = 0;
	int x, n;

	scanf("%d", &x);
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d %d", &a, &b);
		sum += a * b;
	}
	
	if (sum == x)
		printf("Yes\n");
	else
		printf("No\n");

	return 0;
}