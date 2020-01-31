import java.util.*;
public class Q6_7{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("最小値>");
		int inputMin=scan.nextInt();
		System.out.print("最大値>");
		int inputMax=scan.nextInt();
		prime(inputMin,inputMax);
	}
	static void prime(int x,int y){
		boolean jdg=true;
		for(int i=x;i<y;i++){
			if(i%2==0){
				jdg=false;
			}else{	

				for(int j=3;j<y/2;j+=2){
					if(i%j==0){
						jdg=false;
					}
				}
			}
			if(jdg==true){
				System.out.print(i+" ");
			} 
		}
		System.out.println();
	}
}
