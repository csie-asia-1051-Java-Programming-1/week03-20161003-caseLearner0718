package hw;

import java.util.Scanner;

public class hw02_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入你要輸入幾個數");
		int time=scn.nextInt();
		int g=0,n=0;
		while(time>0){
			System.out.println("請輸入一個數字");
			int x=scn.nextInt();
			if(x>0){
				g++;
			}
			else if(x<0){
				n++;
			}
			time--;
		}
		System.out.println("正數" + g +"個");
		System.out.println("負數" + n +"個");
	}

}
