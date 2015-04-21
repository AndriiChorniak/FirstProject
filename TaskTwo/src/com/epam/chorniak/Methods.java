package com.epam.chorniak;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
	public static void numbers() {
		int num = 0;

		System.out.println("Введите количество: ");
		Scanner scan = new Scanner(System.in);
		if (scan.hasNext()) {
			num = scan.nextInt();
			int arr[] = new int[num];

			if (num != 0) {
				System.out.println("Введите элементы массива: ");
				Scanner scan2 = new Scanner(System.in);
				for (int i = 0; i < arr.length; i++) {
					arr[i] = scan2.nextInt();
				}

				minMaxLengthNumber(arr);
				sortLength(arr);
				avgLength(arr);
				diferenceNumber(arr);
				findOddNumbers(arr);
				onlyDifferentNumber(arr);
				increase(arr);

			} else {
				System.out.println("Слишком короткий массив!");
				numbers();
			}

		}
	}

	public static void minMaxLengthNumber(int[] arr) {
		String str;
		int length = 0;
		int tmpLength = 0;
		int tmpElem = 0;
		int tmpMaxLength = 0;
		int tmpMaxElem = 0;

		tmpLength = Integer.toString(arr[0]).length();
		for (int k : arr) {
			str = Integer.toString(k);
			length = str.length();
			if (tmpLength >= length) {
				tmpLength = length;
				tmpElem = k;
			}
			if (tmpMaxLength <= length) {
				tmpMaxLength = length;
				tmpMaxElem = k;
			}

		}
		System.out.println("Наименьшее число =  " + tmpElem
				+ " количество: " + tmpLength + " символов");
		System.out.println("Наибольшее  число: " + tmpMaxElem
				+ " количество: " + tmpMaxLength + " символов");
	}

	public static void sortLength(int[] arr) {
		String strs[] = new String[arr.length];
		String elem;
		int i;
		for (i = 0; i < strs.length; i++) {
			strs[i] = Integer.toString(arr[i]);
		}
		for (i = 0; i < strs.length - 1; i++) {
			for (int j = i + 1; j < strs.length; j++) {
				if (strs[i].length() > strs[j].length()) {
					String tmp = strs[i];
					strs[i] = strs[j];
					strs[j] = tmp;
				}
			}
		}

		System.out.println("отсортированные элементы: "
				+ Arrays.toString(strs));
		for (i = 0; i < strs.length - 1; i++) {
			for (int j = i + 1; j < strs.length; j++) {
				if (strs[i].length() < strs[j].length()) {
					String tmp = strs[i];
					strs[i] = strs[j];
					strs[j] = tmp;
				}
			}
		}
		System.out.println("отсортированные элементы в обратном порядке: "
						+ Arrays.toString(strs));
	}

	public static void avgLength(int[] arr) {
		String str;
		String less = "";
		String more = "";
		int length = 0;
		for (int k : arr) {
			str = Integer.toString(k);
			length = length + str.length();
		}
		length = length / arr.length;
		for (int k : arr) {
			str = Integer.toString(k);
			if (str.length() < length)
				less = less + " " + str + " длинна: " + str.length()
						+ "; ";

			else if (str.length() > length)
				more = more + " " + str + " длинна: " + str.length()
						+ "; ";
		}
		System.out.println("Элементы меньше средней длинны: " + less);
		System.out.println("Элементы больше средней длинны: " + more);
	}

	public static void diferenceNumber(int[] arr) {
		String[] numArr = new String[arr.length];
		String str;
		String difStr;
		String subStr;
		int i = 0;
		int j = 0;
		for (i = 0; i < arr.length; i++) {
			difStr = "";
			str = Integer.toString(arr[i]);
			for (j = 0; j < str.length(); j++) {
				subStr = String.valueOf(str.charAt(j));
				if (difStr.contains(subStr)) {
					continue;
				} else {
					difStr = difStr + subStr;
				}
			}
			numArr[i] = difStr;
		}
		subStr = numArr[0];
		j = 0;
		for (i = 0; i < numArr.length; i++) {
			if (numArr[i].length() < subStr.length()) {
				subStr = numArr[i];
				j = i;
			}

		}
		System.out.println("Число с минимальным колличеством различных цифр: "
				+ arr[j]);
	}

	public static void findOddNumbers(int[] arr) {
		String str;
		int res1;
		int res2;
		int r;
		System.out.print(" Числа с одинаковым количеством четных и нечетных цифр: ");
		for (int k : arr) {
			str = Integer.toString(k);
			res1 = 0;
			res2 = 0;
			if ((str.length() % 2 == 0) && (k % 2 == 0)) {
				while (k > 0) {
					r = k % 10;
					k = k / 10;
					if (r % 2 == 0) {

						res1++;
					} else {
						res2++;
					}

				}

				if (res1 == res2)
					System.out.print(str + " ");
			}

		}
	}

	public static void increase(int[] arr) {
		String str;
		int result;
		int r;
		int k;
		System.out.print("\nЧисло с цифрами по возрастанию: ");

		for (int i = 0; i < arr.length; i++) {

			str = Integer.toString(arr[i]);
			result = 0;

			if (str.length() > 1) {
				while (arr[i] > 0) {
					r = arr[i] % 10;
					arr[i] = arr[i] / 10;
					k = arr[i] % 10;
					if (r > k) {

						result++;
					} else
						break;

				}

				if (result == str.length()) {
					System.out.print(" " + str);
					break;
				}
			}
		}
	}

	public static void onlyDifferentNumber(int[] arr) {
		String str;
		String elem;
		System.out.print("Числа c разными цифрами: ");
		int i;
		for (i = 0; i < arr.length; i++) {

			int m = 0;

			int much = 0;
			str = Integer.toString(arr[i]);

			for (int j = 0; j < str.length(); j++) {
				elem = String.valueOf(str.charAt(j));
				m = str.split(elem).length - 1;
				much = much + m;
			}
			if (much == str.length() - 1) {
				System.out.print(arr[i] + " ");
				break;
			}
		}

	}

	public static void outMatrix() {
		int n = 3;
		int k = 1;
		int arr[][] = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = k++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}
		

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}
	}

	public static void inputMatrix() {
		int n = 3;

		int arrInt[][] = new int[n][n];
		double arr[][] = new double[n][n];
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = 0; j < arrInt.length; j++) {
				arrInt[i][j] = -n + (int) (Math.random() * (n + n) + 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = -n + (int) (Math.random() * (n + n) + 1);
			}
		}

		for (int i = 0; i < arrInt.length; i++) {
			for (int j = 0; j < arrInt.length; j++)
				System.out.print(arrInt[i][j] + "  ");
			System.out.println();

		}

		System.out.println("----------Сортировка по строкам----------");
		sortByRow(arrInt);
		System.out.println("----------Сортировка по столбцам----------");
		sortByCol(arrInt);
		System.out.println("----------Сдвиг вниз----------");
		moveDown(arrInt, 7);
		System.out.println("----------Сдвиг ввверх----------");
		moveUp(arrInt, 2);
		System.out.println("----------Сдвиг вправо----------");
		moveRight(arrInt, 2);
		System.out.println("----------Сдвиг влево----------");
		moveRight(arrInt, 2);
		System.out
				.println("----------Последовательность возрастающих элементов----------");
		elemsSummMore(arrInt);
		System.out
				.println("----------Последовательность убывающих элементов----------");
		elemsSummLow(arrInt);
		System.out
				.println("----------Cуммы между положительными элементами----------");
		elemsSummBetween(n);
		System.out.println("----------Поворот матрицы----------");
		System.out.println("ДО:");
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = 0; j < arrInt.length; j++)
				System.out.print(arrInt[i][j] + "  ");
			System.out.println();
		}
		System.out.println("Поворот на 90 градусов:");
		rotation(arrInt);
		System.out.println("Поворот на 180 градусов:");
		rotation(arrInt);
		System.out.println("Поворот на 270 градусов:");
		rotation(arrInt);
		System.out
				.println("----------Матрица минус среднее арифметическое----------");
		System.out.println("ДО:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}

		subtrAvg(arr);

		compress();
		System.out.println("----------Матрица c нулями в конце----------");
		zeroS(arrInt);

	}

	public static void sortByRow(int[][] arr) {

		for (int k = 0; k < arr.length; k++)
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length - 1; j++) {
					if (arr[i][j] > arr[i][j + 1]) {
						int temp = arr[i][j];
						arr[i][j] = arr[i][j + 1];
						arr[i][j + 1] = temp;
					}
				}
			}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}
	}

	public static void sortByCol(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				for (int k = 0; k < arr.length; k++) {
					if (arr[j][j] < arr[k][j]) {
						int tmp = arr[j][j];
						arr[j][j] = arr[k][j];
						arr[k][j] = tmp;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}
	}

	public static void moveDown(int[][] arr, int pos) {
		int k;
		for (k = 0; k < arr.length; k++) {
			int size = arr.length;
			for (int i = 0; i < pos; i++) {
				int tmp = arr[size - 1][k];
				for (int j = size - 1; j > 0; j--) {
					arr[j][k] = arr[j - 1][k];
				}
				arr[0][k] = tmp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}
	}

	public static void moveUp(int[][] arr, int pos) {
		int tmp;
		for (int i = 0; i < pos; i++) {
			for (int j = 0; j < arr.length; j++) {
				tmp = arr[0][j];

				for (int k = 0; k < arr.length - 1; k++) {
					arr[k][j] = arr[k + 1][j];
				}
				arr[arr.length - 1][j] = tmp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}
	}

	public static void moveRight(int[][] arr, int pos) {
		int k;
		for (k = 0; k < arr.length; k++) {
			int size = arr.length;
			for (int i = 0; i < pos; i++) {
				int temp = arr[k][size - 1];
				for (int j = size - 1; j > 0; j--) {
					arr[k][j] = arr[k][j - 1];
				}
				arr[k][0] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}
	}

	public static void moveLeft(int[][] arr, int pos) {
		int tmp;
		for (int i = 0; i < pos; i++) {
			for (int j = 0; j < arr.length; j++) {
				tmp = arr[j][0];

				for (int x = 0; x < arr.length - 1; x++) {
					arr[j][x] = arr[j][x + 1];
				}
				arr[j][arr.length - 1] = tmp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();

		}
	}

	public static void elemsSummMore(int[][] arr) {
		int counter = 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i][j] < arr[i][j + 1]) {
					counter++;
				} else {
					if (counter > result) {
						result = counter + 1;

					}
					counter = 0;
				}
			}
		}
		System.out.println(result);
	}

	public static void elemsSummLow(int[][] arr) {
		int counter = 0;
		 int result = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i][j] > arr[i][j + 1]) {
					counter++;
				} else {
					if (counter > result) {
						result = counter + 1;

					}
					counter = 0;
				}
			}
		}
		System.out.println(result);
	}

	public static void elemsSummBetween(int n) {

		int arr[][] = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = -n + (int) (Math.random() * (n + n) + 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();
		}

		int summ;
		lab: for (int i = 0; i < arr.length; i++) {
			summ = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] >= 0) {
					for (int x = j + 1; x < arr.length; x++) {
						if (arr[i][x] < 0) {
							summ = summ + arr[i][x];
						} else {
							System.out.println("Сумма в " + i + " строке: "
									+ summ);
							continue lab;
						}
					}
				}

			}

		}
	}

	public static void rotation(int[][] mass) {

		int size = mass.length;
		for (int i = 0; i < size / 2; i++) {
			for (int j = i; j < size - 1 - i; j++) {

				int tmp = mass[i][j];
				mass[i][j] = mass[j][size - 1 - i];
				mass[j][size - 1 - i] = mass[size - 1 - i][size - 1 - j];
				mass[size - 1 - i][size - 1 - j] = mass[size - 1 - j][i];
				mass[size - 1 - j][i] = tmp;
			}
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++)
				System.out.print(mass[i][j] + "  ");
			System.out.println();

		}
	}

	public static void subtrAvg(double[][] arr) {

		double sum = 0;
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				sum = sum + (double) arr[i][j];

			}
		}
		double avg = sum / (n * n);
		System.out.println("ПОСЛЕ:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = arr[i][j] - avg;
				System.out.print(arr[i][j] + "  ");

			}
			System.out.println();

		}

	}

	public static void compress() {

		System.out.println("-----Матрица до сжатия-----");
		int[][] nullArr = { 
				{ 1, 6, 0, 6, 3 }, { 0, 0, 0, 0, 0 },
				{ 1, 6, 0, 6, 3 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, 
				};

		for (int k = 0; k < nullArr.length; k++) {
			for (int m = 0; m < nullArr.length; m++)
				System.out.print(nullArr[k][m] + "  ");
			System.out.println();
		}
		boolean[] horizontalZeros = new boolean[nullArr.length];
		boolean[] verticalZeros = new boolean[nullArr.length];
		int horizontalLength = nullArr.length;
		int verticalLength = nullArr.length;
		boolean flag = true;
		for (int i = 0; i < nullArr.length; i++) {
			for (int j = 0; j < nullArr.length; j++) {
				if (nullArr[i][j] != 0) {
					flag = false;
				}
			}
			if (flag) {
				horizontalLength--;
			}
			verticalZeros[i] = !flag;
			flag = true;
		}
		for (int i = 0; i < nullArr.length; i++) {
			for (int j = 0; j < nullArr.length; j++) {
				if (nullArr[j][i] != 0) {
					flag = false;
				}
			}
			if (flag) {
				verticalLength--;
			}
			horizontalZeros[i] = !flag;
			flag = true;
		}
		int[][] result = new int[horizontalLength][verticalLength];
		for (int i = 0, i1 = 0; i < nullArr.length; i++) {
			if (verticalZeros[i]) {
				for (int j = 0, j1 = 0; j < nullArr.length; j++) {
					if (horizontalZeros[j]) {
						result[i1][j1++] = nullArr[i][j];
					}
				}
				i1++;
			}
		}
		System.out.println("-----Сжатая матрица-----");
		System.out.println(Arrays.deepToString(result));
	}

	public static void zeroS(int[][] arr) {
		int x = 0;
		int y = 0;
		int[][] newMass = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] != 0) {
					newMass[x][y] = arr[i][j];
					y++;
					if (y == arr.length) {
						y = 0;
						x++;
					}

				}
			}
		}
		for (int i = 0; i < newMass.length; i++) {
			for (int j = 0; j < newMass.length; j++)
				System.out.print(newMass[i][j] + "  ");
			System.out.println();
		}
	}

}
