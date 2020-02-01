import java.util.*;
public class Q6_8{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("開始項>");
		int inputStart=scan.nextInt();
		System.out.print("終了項>");
		int inputEnd=scan.nextInt();
		for(int n=inputStart;n<=inputEnd;n++){
			System.out.print(fibo(n)+ " ");
		}
		System.out.println();

		System.out.println("11番目から20番目の項は");
		for(int n=11;n<=20;n++){
			System.out.print(fibo(n)+ " ");
		}
		System.out.println();
	}

	static int fibo(int n){
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return fibo(n-2)+fibo(n-1);
		}
	}
}
