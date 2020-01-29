import java.util.*;
public class Q6_3{
	public static void main(String[] args){
		System.out.print("整数xを入力してください>");
		int inputX=new Scanner(System.in).nextInt();
		System.out.print("整数yを入力してください>");
		int inputY=new Scanner(System.in).nextInt();
		System.out.print("整数zを入力してください>");
		int inputZ=new Scanner(System.in).nextInt();
		System.out.printf("大きいのは"+max((max(inputX,inputY)),inputZ)+"です。");
	}
	static int max(int i,int j){
		int ans=0;
		if(i>j){
			ans=i;
		}else{
			ans=j;
		}
		return ans;
	}
}
