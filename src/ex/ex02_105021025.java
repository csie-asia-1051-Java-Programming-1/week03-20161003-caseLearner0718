package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字母");
		char val = scn.next().charAt(0);
		if(val>=65 && val<=90){
			System.out.println("這是大寫字母");
		}
		else if(val>=97 && val<=122){
			System.out.println("這是小寫字母");
		}
		else{
			System.out.println("警告! 這是非法輸入");
		}
	}

}
