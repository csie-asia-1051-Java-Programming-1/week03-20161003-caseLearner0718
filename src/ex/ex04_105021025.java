package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex04_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字");
		int val = scn.nextInt();
		int tel=0;
		String str = Integer.toString(val);
		while(val%10>0){
			tel=tel+val%10;
			val/=10;
		}
		System.out.print(tel + "(");
		for(int a=0;a<str.length();a++){
			System.out.print(str.charAt(a));
			if(a!=str.length()-1){
				System.out.print("+");
			}
		}
		System.out.print(")");
	}

}
