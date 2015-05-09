package com.epam.chorniak;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Methods {
	public static void hello(String str) {
		System.out.println("Hello "+str);
	}
	public static void  invert (String[] arr) {
		for (int i = (arr.length / 2) - 1; i >= 0; i--){
			String tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
			}
		for (String inv : arr){
			System.out.print(inv + " ");
		}
		
	}
	public static void rand(int n){
		Random rand = new Random();
		System.out.println();
		int out = 0;
		for (int i = 0; i < n; i++){
			out = rand.nextInt(n);
			System.out.print(out);
		}
	}
	public static void scan(String str){
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
		int num = scan.nextInt();
		if (num == Integer.parseInt(str) )
			System.out.println("password is correct");
		else System.out.println("password is incorrect");
	}
		scan.close();
		}
	
	public static void sumArgs(String ... args){
		int sum=0, multiple = 1;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
			multiple = multiple * Integer.parseInt(args[i]);
		}
		System.out.println("Sum = "+ sum);
		System.out.println("Multiple = "+ multiple);
	}
	
	public static void evenOdd(int[] arr) {
		int even = 0;
	  	int odd=0;
	  	int i=0;
	  	int j=0;
		for(int k : arr) {
        	if (k%2==0) 
        		even++;
        	else odd++;
        	}
		int[] odds = new int[odd];
		int[] evens = new int[even];
        for(int k : arr) {
        	if (k % 2 == 0) {
        	evens[i] = k;
        	i++;
        	}
        	else {
        	odds[j]=k;
        	j++;
        	
        	}
        	
        }
        System.out.println("Нечетные числа "+Arrays.toString(odds));
        System.out.println("Четные числа "+Arrays.toString(evens));
	}
	
	public static void maxMin(int[] arr) {
		int max = 0;
		int min = 0;
		int k = 0;
		max=arr[k];
		min=arr[k];
		for(int i = 1; i < arr.length; i++) {
        	if (arr[i] > max) {
        		max = arr[i];
        		}
        	else if (arr[i] < min) {
        		min = arr[i];
        	};

	}
		System.out.println("максимальное число "+ max);
		System.out.println("минимальное число "+ min);
}
	public static void devisioByTreeOrNine(int[] arr){
		System.out.println("числа, которые деляться на 3 или на 9 :");
		for(int k : arr) {
        	if ((k % 3 == 0) || (k % 9 == 0)) {
        			System.out.print(  k+" ");
        	}
		}
		System.out.println();
	}
	
	public static void devisionByFiveAndSeven(int[] arr){
		System.out.println("числа, которые деляться на 5 и на 7 :");
		for(int k : arr) {
        	if ((k % 5 == 0) && (k % 7 == 0)) {
        			System.out.print(k+" ");
        	}
		}
	}
	
	public static void threeNotSame(int[] arr) {
		String elem;
		int i = 0;
		System.out.print("трехзначные числа, в которых нет одинаковых цифр: ");
		for(int k : arr) {
			elem = Integer.toString(k);
			if (elem.length() == 3) 
					if (elem.charAt(i) != elem.charAt(i + 1) && elem.charAt(i) != elem.charAt(i + 2) && elem.charAt(i + 1) != elem.charAt(i + 2))
						System.out.print(" "+k);
				
	
	}
	}
	public static void lucky (int[] arr) {
		String str;
		int sumLeft = 0;
		int sumRight = 0;
		System.out.println();
		System.out.print("счастливые числа: ");
		for(int k = 0; k < arr.length; k++) {
			str = Integer.toString(arr[k]);
			
				if (str.length() % 2== 0) {
					
					for (int index = 0; index < str.length() / 2; index++){
						
						sumLeft += Character.getNumericValue(str.charAt(index));
						
						}
					for (int index = str.length() / 2; index < str.length(); index++){
						sumRight += Character.getNumericValue(str.charAt(index));
						}
					if (sumLeft == sumRight)
						System.out.print(str+" ");
		}
				
		}
}
	
	public static void halfSum(int[] arr) {
		System.out.print(": ");
		for(int i = 1; i < arr.length-1; i++) {
			if ( ((arr[i - 1] + arr[i + 1]) % 2 == 0) && (arr[i] == (arr[i - 1] + arr[i + 1]) / 2)) 
				System.out.print(" "+arr[i]);
		}
	}
}
