import java.util.*;
public class Q6_1{
	public static void main(String[] args){
		System.out.print("整数を入力してください>");
		int input=new Scanner(System.in).nextInt();
		System.out.println("二乗は"+calc(input)+"です");
	}
	static int calc(int x){
		return x*x;
	}
}
