package com.heima;


/*
 * ���� ����¼�������������Ƿ���ȣ����
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
//			default://ִ��y= 4
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
//		System.out.println("�������һ����");
//		int i = sc.nextInt();
//		System.out.println("������ڶ�����");
//		int j = sc.nextInt();
//		
//		if(i ==  j) {
//			System.out.println("���");
//		}else {
//			System.out.println("�����");
//		}
//		sc = null;
		
		/*
		 * ����     ����¼��һ�����磬ʹ��if
		 * 		�ж������ż�����ӡ�������ż�������¼������������ӡ����
		 * ����
		 * 		�������¼��� import java.util.Scanner;
		 * 		��������¼�����   Scanner sc = new Scanner(System.in);
		 * 		¼������   sc.nextInt();
		 * 		��¼��������2ȡģ���ж��Ƿ���������ż��
		 * 
		 */

//		Scanner sc =  new Scanner(System.in);
//		
//		System.out.println("����������");
//		int i = sc.nextInt();
//		if(i % 2 == 0) {
//			System.out.println("ż��");
//		}else{
//			System.out.println("����");
//
//		}
//		
		/*
		 *		 ����¼��һ��������ʹ��if����ж�xȡֵ��Χ
				x��y�Ĺ�ϵ�������£�
					x>=3		y = 2x + 1;
					-1<=x<3	y = 2x;
					x<=-1		y = 2x �C 1;
				���ݸ�����x��ֵ�������y��ֵ�����
				
				
				����  --- ��������¼�����   --- ��������x ��y��  ����if�����ж�x��y���и�ֵ����
		 */
		Scanner sc = new Scanner(System.in);
		int y = 0;
		System.out.println("����������");
		
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
