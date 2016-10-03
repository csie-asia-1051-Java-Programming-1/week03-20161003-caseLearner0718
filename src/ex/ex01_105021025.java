package ex;
/*
 * Topic: 輸入�??��?�串，並??��?��?��?�輸?��??
 * Date: 2016/10/03
 * Author: 1050210XX ?��永振?�師
 */
import java.util.Scanner;
public class ex01_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字串");
		String str = scn.next();
		for(int a=str.length()-1;a>=0;a--){
			System.out.print(str.charAt(a));
		}
	}

}
