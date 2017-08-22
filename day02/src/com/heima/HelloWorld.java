package com.heima;


/*
 * 需求： 键盘录入两个数，看是否相等，相等
 * 
 */
import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
//		int i= 20;
//		int j = 25;
//		System.out.println((i==j));
//		System.out.println(( i > j ? i : j));
//		int x = 2,y=3;
//		switch(x)
//		{
//			default://执行y= 4
//			{
//				System.out.println("default");
//				y++;
//			}
//			case 3:{
//				System.out.println(3);
//				y++;
//			}
//				break;
//			case 4:{
//				System.out.println(4);
//				y++;
//			}
//		}
//		System.out.println("y="+y + "x = " + x);
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入第一个数");
//		int i = sc.nextInt();
//		System.out.println("请输入第二个数");
//		int j = sc.nextInt();
//		
//		if(i ==  j) {
//			System.out.println("相等");
//		}else {
//			System.out.println("不相等");
//		}
//		sc = null;
		
		/*
		 * 需求     键盘录入一个正如，使用if
		 * 		判断如果是偶数则打印这个数是偶数，如果录入的是奇数则打印奇数
		 * 分析
		 * 		导入键盘录入包 import java.util.Scanner;
		 * 		创建键盘录入对象   Scanner sc = new Scanner(System.in);
		 * 		录入输入   sc.nextInt();
		 * 		将录入输入与2取模，判断是否是奇数或偶数
		 * 
		 */

//		Scanner sc =  new Scanner(System.in);
//		
//		System.out.println("请输入整数");
//		int i = sc.nextInt();
//		if(i % 2 == 0) {
//			System.out.println("偶数");
//		}else{
//			System.out.println("奇数");
//
//		}
//		
		/*
		 *		 键盘录入一个整数，使用if语句判断x取值范围
				x和y的关系满足如下：
					x>=3		y = 2x + 1;
					-1<=x<3	y = 2x;
					x<=-1		y = 2x – 1;
				根据给定的x的值，计算出y的值并输出
				
				
				导包  --- 创建键盘录入对象   --- 创建变量x 和y；  利用if语言判断x对y进行赋值操作
		 */
		Scanner sc = new Scanner(System.in);
		int y = 0;
		System.out.println("请输入整数");
		
		int x = sc.nextInt();
		if(x >= 3) {
			y = 2 * x + 1;
		}else if(x < 3 && x >= -1 ) {
			y = 2 * x ;
		}else {
			y = 2 * x - 1;
		}
		System.out.println("y = " + y);
	}
}
