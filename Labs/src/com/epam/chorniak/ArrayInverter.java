package com.epam.chorniak;

import java.util.Arrays;

public class ArrayInverter {
	public static void  invert (int[] arr) {
		for (int i = (arr.length / 2) - 1; i >= 0; i--){
			int tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
		}
	}
	public static int[] merge(int[] first, int[] second){
		int[] result = new int[first.length + second.length];
		int firstIndex = 0;
		int secondIndex = 0;
		while (firstIndex + secondIndex < result.length){
			if (firstIndex == first.length) {
				System.arraycopy(second, secondIndex, result, firstIndex + secondIndex, second.length - secondIndex); 
				return result;
			}
			else if (secondIndex == second.length) {
				System.arraycopy(first, firstIndex, result, firstIndex + secondIndex, first.length - firstIndex); 
				return result;
			}
			else  if (first[firstIndex] < second[secondIndex]){
				result[firstIndex + secondIndex] = first[firstIndex++];
			}
			else{
				result[firstIndex + secondIndex] = second[secondIndex++];   
			}
			
			
		}
		return result;
	}
	
	public static void bubbleSort(int arr[]){
		int tmp = 0;
		for(int i = arr.length - 1; i > 0; i--){
			for(int j = arr.length - 1; j > 0; j--){
				if (arr[j] < arr[j-1]){
				tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
				}
				
			}
		}
	}
	public static void triangle(int arr[]){
		int tmp = 0;
		for(int i = 0; i < arr.length -1; i++){
			for(int j = i + 1; j < arr.length; j++){
				
				if (arr[i] > arr[j]){
				tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				System.out.print(arr[i] + "-" +arr[j] + " ");
				}
				
			}
			System.out.println();
		}
	}
	
	
	public static void selectSort(int arr[]){
		int tmp = 0;
		int min = 0;
		for (int barrier = 0; barrier < arr.length - 1; barrier++){
			min = barrier;
			for (int index = barrier + 1; index < arr.length; index++){
				if (arr[index] < arr[min]){
					min = index;
				}
			}
					tmp = arr[barrier];
					arr[barrier] = arr[min];
					arr[min] = tmp;
				
			
		}
	}
	
	public static void selectSortMod(int arr[]){
		int tmp = 0;
		int min = 0;
		int local = 0;
		for (int barrier = 0; barrier < arr.length - 1; barrier++){
			min = barrier;
			local = arr[barrier];
			for (int index = barrier + 1; index < arr.length; index++){
				if (arr[index] < arr[min]){
					min = index;
				}
					tmp = local;
					local = arr[min];
					arr[min] = tmp;
				
			}
		}
	}
	
	public static void insertSort(int arr[]) {
		int tmp;
		for (int i = 1; i < arr.length; i++){
			for (int j = i; j > 0 && arr[j-1] > arr[j]; j--){
				
				Arrays.binarySearch(arr, 5);
				
				tmp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = tmp;
			}
		}
		
	}
	
	public static void insertSortBinary(int arr[]) {
		int tmp;
		for (int i = 1; i < arr.length; i++){
			for (int j = i; j > 0 &&  arr[j-1] > arr[j]; j--){
				Arrays.binarySearch(arr, arr[j]);
				tmp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = tmp;
			}
		}
		
	}
	
	public static int[][] matrixMult(int firstMatrix[][], int secondMatrix[][]){
		//if (firstMatrix[0].length == secondMatrix.length){
			if (firstMatrix == null || secondMatrix == null)
				throw new IllegalArgumentException();
			for (int i = 0; i < firstMatrix.length && i < secondMatrix.length; i++)
				if (firstMatrix[i] == null || secondMatrix[i] == null)
					throw new IllegalArgumentException();
			if (firstMatrix[0].length == secondMatrix.length)
				throw new IllegalArgumentException();
		int[][] result = new int[firstMatrix.length][secondMatrix[0].length];
		for (int i = 0; i < result.length; i++){
			for (int j = 0; j < result[0].length; j++){
				int k = 0;
				while (k < secondMatrix.length){
				result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				k++;
				}
			}
		}
		return result;
	//}
		//else 
			//return System.out.println("Matrixs have incorrect length");
	}

}
