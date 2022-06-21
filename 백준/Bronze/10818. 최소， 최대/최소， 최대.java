import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int Arr[] = new int[N];
		for(int i=0;i<N;i++) {
			Arr[i] = sc.nextInt();
		}
		Arrays.sort(Arr);
		int max = Arr[N-1];
		int min = Arr[0];
		
		System.out.println(min + " " + max);
		sc.close();
	}
}