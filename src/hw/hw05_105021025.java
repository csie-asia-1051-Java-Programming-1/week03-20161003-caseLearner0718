package hw;
import java.util.Scanner;
public class hw05_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int n = scn.nextInt();
		int tel=0;
		for(int a=n;a>0;a--){
			tel=tel+a*(a+1);
		}
		System.out.println(tel);
	}

}
