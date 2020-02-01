import java.util.*;
public class Q6_7{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("最小値>");
		int inputMin=scan.nextInt();
		System.out.print("最大値>");
		int inputMax=scan.nextInt();
		prime(inputMin,inputMax);
		System.out.println();
		System.out.println("10000以上10100未満の素数は、");
		prime(10000,10100);
	}
	static void prime(int x,int y){
		for(int i=x;i<y;i++){
			boolean jdg=true;
			if(i==1){
					jdg=false;
			}
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					jdg=false;
				}
			}
			if(jdg==true){
			System.out.print(i+" ");
			}
		} 
	System.out.println();
	}
}
