package pizda2;

import java.util.Scanner;
//я создал фукции +- ,прикрепил их к кнопакам, создал ввод с клавы для всех ,как это все объединить  не понимаю 
public class pizdec {
	static Scanner loh = new Scanner(System.in);
	public static void main(String args[]) {
	pizdec Pizda=new pizdec();
		System.out.println( "Значение полученое:" + Pizda.sum(2, 3));
	
	}
	//ввод 1 числа
	public static int first() {
		System.out.println("Введите число:");
		int num1 ;
		if (loh.hasNextInt()) {
			num1 = loh.nextInt();
		} else {
			System.out.println("Ты долбаеб!");
			loh.next();
			num1 = first();
		}
		return num1;
	}
	//ввод знака
	public static char getOperation() {
		System.out.println("Введи операцию:");
		char operation;
		if (loh.hasNext()) {
			operation = loh.next().charAt(0);
	} 	else {
			System.out.println("Ты долбаеб!Трай еще) ");
			loh.next();
			operation = getOperation();
			}
		 return operation;
	}
	//прикрепляю кнопки к функциям 
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
		//ввод 2 числа 
	}
	public static int second() {
		System.out.println("Введите еще одно число:");
		int num2;
		if (loh.hasNextInt()) {
			num2 = loh.nextInt();
		} else {
			System.out.println("Ты долбаеб");
			loh.next();
			num2 = first();
		}
		return num2;
	}
		//функции 

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
