import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int height[] = new int[N]; //키
		int weight[] = new int[N]; //몸무게
		int rank[] = new int[N]; //등수
		
		for(int i = 0; i < N; i++) {
			height[i] = sc.nextInt();
			weight[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			rank[i] = 1;
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(height[i] < height[j] && weight[i] < weight[j]){
					rank[i]++;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.print(rank[i] + " ");
		}
				
		sc.close();
	}
}