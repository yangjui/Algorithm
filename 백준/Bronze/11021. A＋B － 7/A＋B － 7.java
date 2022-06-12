import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum[] = new int[T];
		
		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			sum[i] = A + B;
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println("Case #"+ (i+1) + ": " + sum[i]);
		}
		sc.close();
	}
}