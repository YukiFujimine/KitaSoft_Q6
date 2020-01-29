import java.util.*;
public class Q6_2{
	public static void main(String[] args){
		System.out.print("整数xを入力してください>");
		int inputX=new Scanner(System.in).nextInt();
		System.out.print("整数yを入力してください>");
		int inputY=new Scanner(System.in).nextInt();
		avr(inputX,inputY);
		System.out.printf("平均は%dです",avr(inputX,inputY));
	}
	static int avr(int x,int y){
		return (x+y)/2;
	}
}
