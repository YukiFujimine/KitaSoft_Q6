import java.util.*;
public class Q6_4{
	public static void main(String[] args){
		System.out.print("サイズを入力してください>");
		int input=new Scanner(System.in).nextInt();
		disp(input);
		disp(3);
		disp(4);
		disp(5);
	}
	static void disp(int x){
		for(int i=0;i<x;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println();
	}
}
