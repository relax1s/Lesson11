package by.relax1s.lesson11.main;

import java.util.Random;

public class Task09 {

	public static void main(String[] args) {

		int n = 7;
		int[][] mas = new int[n][n];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}

			System.out.println();

		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%3d", mas[i][i]);
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%3d", mas[i][mas[0].length - 1 - i]);
		}
	}
}
