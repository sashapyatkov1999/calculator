package pizda2;

import java.util.Scanner;
//� ������ ������ +- ,��������� �� � ��������, ������ ���� � ����� ��� ���� ,��� ��� ��� ����������  �� ������� 
public class pizdec {
	static Scanner loh = new Scanner(System.in);
	public static void main(String args[]) {
	pizdec Pizda=new pizdec();
		System.out.println( "�������� ���������:" + Pizda.sum(2, 3));
	
	}
	//���� 1 �����
	public static int first() {
		System.out.println("������� �����:");
		int num1 ;
		if (loh.hasNextInt()) {
			num1 = loh.nextInt();
		} else {
			System.out.println("�� �������!");
			loh.next();
			num1 = first();
		}
		return num1;
	}
	//���� �����
	public static char getOperation() {
		System.out.println("����� ��������:");
		char operation;
		if (loh.hasNext()) {
			operation = loh.next().charAt(0);
	} 	else {
			System.out.println("�� �������!���� ���) ");
			loh.next();
			operation = getOperation();
			}
		 return operation;
	}
	//���������� ������ � �������� 
	public static char znaki(char operation) {
		switch(operation) {
		case '+' :
			int sum;
			break;
		case '-' :
			int minus;
			break;
		case '/':
			int delenie;
			break;
		case '*':
			int multiply;
			break;
		}
		//���� 2 ����� 
	}
	public static int second() {
		System.out.println("������� ��� ���� �����:");
		int num2;
		if (loh.hasNextInt()) {
			num2 = loh.nextInt();
		} else {
			System.out.println("�� �������");
			loh.next();
			num2 = first();
		}
		return num2;
	}
		//������� 

	static int sum(int num1, int num2) {
		return num1+num2;
	}
	static int minus(int num1,int num2) {
		return  num1-num2;
	}
	static int delenie(int num1,int num2) {
		return num1/num2;
	}
	static int multiply(int num1,int num2) {
		return num1*num2;
	}
	
}
