package hw;
import java.util.Scanner;
public class hw04_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int val = scn.nextInt();
		int val2 = val;
		int tel=1;
		while(val>0){
			tel*=val;
			val--;
		}
		System.out.println(val2 + "!=" +tel);
	}

}
