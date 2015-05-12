package com.epam.chorniak;

import java.util.Arrays;
import java.util.Random;

public class Demo {


	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1,0};
		int arr1[] = {5,4,3,2,1,0};
		int arr2[] = {1,7,3,0,5};
		Random random = new Random();
		int n = 100;
		int arr3[] = new int[n];
		for (int i = 0; i < n; i++)
			arr3[i] = (random.nextInt(n * 2) );
		int arr4[] = new int[n];
		for (int i = 0; i < n; i++)
			arr4[i] = (random.nextInt(n * 2) );
		int arr5[] = new int[n];
		for (int i = 0; i < n; i++)
			arr5[i] = (random.nextInt(n * 2) );
		
		int arr6[] = new int[n];
		for (int i = 0; i < n; i++)
			arr6[i] = (random.nextInt(n * 2) );
		
		int firstMatrix[][] = new int[3][2];
		firstMatrix[0][0] = 1;
		firstMatrix[0][1] = 2;
		firstMatrix[1][0] = 7;
		firstMatrix[1][1] = 8;
		firstMatrix[2][0] = 3;
		firstMatrix[2][1] = 4;
		int secondMatrix[][] = new int[2][4];
		secondMatrix[0][0] = 3;
		secondMatrix[0][1] = 4;
		secondMatrix[0][2] = 5;
		secondMatrix[0][3] = 6;
		secondMatrix[1][0] = 9;
		secondMatrix[1][1] = 0;
		secondMatrix[1][2] = 1;
		secondMatrix[1][3] = 2;
		
		ArrayInverter.invert(arr);
		System.out.println(Arrays.toString(arr));
		
		int first[] = {2,5,7,9};
		int second[] = {3,4,6};
		System.out.println(Arrays.toString(ArrayInverter.merge(first, second)));
		
		ArrayInverter.bubbleSort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		ArrayInverter.triangle(arr1);
		
		long firstTime = System.nanoTime();
		ArrayInverter.selectSort(arr3);
		long secondTime = System.nanoTime();
		System.out.println(secondTime - firstTime);
		System.out.println(Arrays.toString(arr3));
		
		long firstTime1 = System.nanoTime();
		ArrayInverter.selectSortMod(arr4);
		long secondTime1 = System.nanoTime();
		System.out.println(secondTime1 - firstTime1);
		System.out.println(Arrays.toString(arr4));
		
		long firstTime2 = System.nanoTime();
		ArrayInverter.insertSort(arr5);
		long secondTime2 = System.nanoTime();
		System.out.println(secondTime2 - firstTime2);
		System.out.println(Arrays.toString(arr5));
		
		long firstTime3 = System.nanoTime();
		ArrayInverter.insertSortBinary(arr6);
		long secondTime3 = System.nanoTime();
		System.out.println(secondTime3 - firstTime3);
		System.out.println(Arrays.toString(arr6));
		
		int [][] result = ArrayInverter.matrixMult(firstMatrix, secondMatrix);
		System.out.println(Arrays.deepToString(result));
	}

}
