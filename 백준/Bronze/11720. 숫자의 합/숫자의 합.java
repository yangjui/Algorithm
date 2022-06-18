import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Arr[] = new int[N];
		String str = sc.next();
		
		for(int i=0;i<N;i++) { //단순히 계산만 하지 않고 배열처리!! 없어도 되는 과정
			Arr[i] = str.charAt(i) - '0';
		}
		
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum += Arr[i];
		}
		
		System.out.println(sum);
		sc.close();
	}
}