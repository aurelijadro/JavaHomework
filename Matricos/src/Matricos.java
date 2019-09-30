
public class Matricos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		matrix1();
		System.out.println();
		matrix2();
		System.out.println();
		matrix3();
		System.out.println();
		matrix4();
		System.out.println();
		matrix5();
		System.out.println();
		matrix6();
		System.out.println();
		matrix7();
		System.out.println();
		matrix8();
	}

	private static void matrix1() {

		for (int x = 0; x < 10; x++) {
			for (int z = 0; z < 10; z++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
	}

	private static void matrix2() {

		for (int x = 0; x < 10; x++) {
			for (int z = 0; z < 10; z++) {
				if (x == z) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

	private static void matrix3() {

		for (int x = 0; x < 10; x++) {
			for (int z = 0; z < 10; z++) {
				if (x == z) {
					System.out.print(1 + " ");
				} else if (x + z == 9) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

	private static void matrix4() {

		for (int x = 0; x < 10; x++) {
			for (int z = 0; z < 10; z++) {
				if (x % 2 == 0) {
					System.out.print(0 + " ");
				} else {
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}
	}

	private static void matrix5() {
		for (int x = 0; x < 10; x++) {
			for (int z = 1; z <= 10; z++) {
				if (x == 0) {
					System.out.print(1 + " ");
				} else if (z % 2 != 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}

	}

	private static void matrix6() {
		for (int x = 0; x < 10; x++) {
			for (int z = 1; z <= 10; z++) {
				if (x == 0) {
					System.out.print(1 + " ");
				} else if (z == 1) {
					System.out.print(1 + " ");
				} else if (z == 10) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

	private static void matrix7() {
		for (int x = 1; x < 10; x++) {
			for (int z = 1; z <= 10; z++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	private static void matrix8() {
		for (int x = 0; x < 9; x++) {
			for (int z = 1; z <= 10; z++) {
				System.out.print((z + x) + " ");
			}
			System.out.println();
		}
	}

}
