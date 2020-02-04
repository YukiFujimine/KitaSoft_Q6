import java.util.*;//サイズと文字を指定して三角形を表示する
public class Q6_5{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("サイズを入力してください>");
        int inputSize=scan.nextInt();
        System.out.print("表示する文字を入力してください>");
        String inputStr=scan.next();

        char[] inputChar=inputStr.toCharArray();    //受け取った文字列をchar型に変換
        char dspC=inputChar[0];                     //一文字めを取り出して、char型変数に代入
        disp(inputSize,dspC);                       //入力したサイズ、文字を引数にしてdispメソッド実行
        disp(3,'赤');
        disp(4,'青');
        disp(5,'黄');
    }
    static void disp(int s,char c){         //s段の三角形をcを表示して作る
        for(int i=0;i<s;i++){               //上から数えたとき、段数と文字の個数が一緒の三角形を作る
            for(int j=0;j<i+1;j++){
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
    }
}
