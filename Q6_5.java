import java.util.*;
public class Q6_5{
	public static void main(String[] args){
		System.out.print("サイズを入力してください>");
		int inputSize=new Scanner(System.in).nextInt();
		System.out.print("表示する文字を入力してください>");
		String inputStr=new Scanner(System.in).next();
		char[] inputChar=inputStr.toCharArray();
		char chara=inputChar[0];
		disp(inputSize,chara);
		disp(3,'赤');
		disp(4,'青');
		disp(5,'黄');
	}
	static void disp(int s,char c){
		for(int i=0;i<s;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}
}
