import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char Arr[] = new char[N.length()];

		for(int i=0;i<N.length();i++) {
			Arr[i] = N.charAt(i);
		}
		
		for(int i=0;i<N.length();i++) {
			if(i % 10 == 0 && i != 0) {
				System.out.println();
				System.out.print(Arr[i]);
			}
			else {
				System.out.print(Arr[i]);
			}
		}
		sc.close();
	}
}