import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //자연수 N
		int min = 0;
		for(int i = 1; i< N; i++) {
			int sum = i;
			int psum = i;
			
			while(psum != 0) {
				sum += psum % 10;
				psum /= 10;
			}
			
			if(sum == N) {
				min = i;
				break;
			}
				
		}
		System.out.println(min);
		sc.close();
	}
}
