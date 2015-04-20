package com.epam.chorniak;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int task = 6;
		String password = "12345";
		switch(task){
		
		case 1:
		Methods.hello(args[0]);
		break;
		
		case 2:
		Methods.invert(args);
		break;
		
		case 3:
		Methods.rand(10);
		break;
		
		case 4:
		Methods.scan(password);
		break;
		
		case 5:
		Methods.sumArgs(args);
 		break;
 		
		case 6:
 		System.out.println("Введите количество");
 		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();		
		}
		Methods.evenOdd(arr);
		Methods.maxMin(arr);
		Methods.devisioByTreeOrNine(arr);
		Methods.devisionByFiveAndSeven(arr);
		Methods.threeNotSame(arr);
		Methods.lucky(arr);
		Methods.halfSum(arr);
		scan.close();
		break;
		
		
			
		}
		
	}
}
