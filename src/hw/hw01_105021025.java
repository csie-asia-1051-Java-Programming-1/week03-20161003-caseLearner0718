package hw;
import java.util.Scanner;
public class hw01_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int val = scn.nextInt();
		int count=0;
		while(val>0){
		count++;
		val/=10;
		}
		System.out.println("這是一個" + count + "位數的數字");
	}

}
