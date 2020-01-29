import java.util.*;
public class Q6_3{
	public static void main(String[] args){
		System.out.print("整数xを入力してください>");
		int inputX=new Scanner(System.in).nextInt();
		System.out.print("整数yを入力してください>");
		int inputY=new Scanner(System.in).nextInt();
		max(inputX,inputY);
		System.out.printf("大きいのは%dです",max(inputX,inputY));
	}
	static int max(int x,int y){
		if(x>y){
			z=x;
		}else{
			z=y;
		}
		return z;
	}
}
