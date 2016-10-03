package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex06_105021025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		double val=scn.nextInt();
		if(val<=-1){
			System.out.println(3*val*val);
		}
		else if(val>=-1 && val<=1){
			System.out.println(val*val*val+3*val-3);
		}
		else if(val>1){
			System.out.println(2*val+3);
		}
	}

}
