import java.util.*;
public class Q6_6{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("何の段?>");
		int inputNum=scan.nextInt();
		multi(inputNum);
		System.out.println();
		for(int i=1;i<=9;i++){
			multi(i);
		}
	}
	static void multi(int x){
		for(int i=1;i<=9;i++){
			System.out.printf("%3d",x*i);
		}
		System.out.println();
	}
}
