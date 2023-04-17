package by.relax1s.lesson11.main;

public class Task14 {
	public static void main(String[] args) {

		int n = 8;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			mas[i][mas[0].length - 1 - i] = i;
		}
		/*
		 * mas[0][mas.length - 1] = 1; mas[1][mas[i].length - 1 - 1] = 2;
		 * mas[2][mas[i].length - 1 - 2] = 3; mas[3][mas[i].length - 1 - 3] = 4;
		 * 
		 * mas[mas.length - 1][mas[i].length - 1 - 7] = n; mas[mas.length - 1 -
		 * 1][mas[i].length - 1 - 6] = n - 1; mas[mas.length - 1 - 2][mas[i].length - 1
		 * - 5] = n - 2; mas[mas.length - 1 - 3][mas[i].length - 1 - 4] = n - 3;
		 */
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}
}