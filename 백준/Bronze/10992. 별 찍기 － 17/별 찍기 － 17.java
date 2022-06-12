import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i<= N; i++) {
			for(int j = i; j<N;j++) {
				System.out.print(" ");
			}
			if(i == N) {
				for(int w = 1; w <= 2*N - 1; w++)
					System.out.print("*");
			}	
			else {
				for(int k=1;k<=2*i-1;k++) {
					if(k>1 && k<2*i-1)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}