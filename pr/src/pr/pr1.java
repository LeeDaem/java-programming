package pr;
import java.util.Scanner;



public class pr1 {



	public static void main(String[] args) {

		System.out.println("1. 가로5개");

		for (int i = 0; i < 5; i++) {

			System.out.print('*');

		}

		System.out.println("\n 2. 세로5개");

		for (int i = 0; i < 5; i++) {

			System.out.print('*');

			System.out.print("\n");

		}

		System.out.println("\n 3. 사각형");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print("*");

			}

			System.out.println("");

		}

		System.out.println("\n 4. 직각삼각형");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i + 1; j++) {

				System.out.print("*");

			}

			System.out.println("");

		}

		System.out.println("\n 5. 직각삼각형 (역방향)");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 - i; j++) {

				System.out.print('*');

			}

			System.out.println("");

		}

		System.out.println("\n 6. 반대 직각삼각형");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4 - i; j++) {

				System.out.print(' ');

			}



			for (int j = 0; j < i + 1; j++) {

				System.out.print('*');

			}

			System.out.println("");

		}

		System.out.println("\n 7. 반대직각삼각형(역방향)");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(' ');

			}



			for (int j = 0; j < 5 - i; j++) {

				System.out.print('*');

			}

			System.out.println("");

		}

	}

}