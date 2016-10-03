package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex03_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字母");
		char val = scn.next().charAt(0);
		if(val>=65 && val<=90){
			val+=32;
			System.out.println(val);
		}
		else if(val>=97 && val<=122){
			val-=32;
			System.out.println(val);
		}
	}

}
