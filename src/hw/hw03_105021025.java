package hw;
import java.util.Scanner;
public class hw03_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int val = scn.nextInt();
		int tel=1;
		for(int a=val;a>0;a--){
			tel=tel*a;
		}
		System.out.println(val + "!=" +tel);
	}

}
