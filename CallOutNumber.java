/*
 * CallOutNumber.java
 * 
 */

/**
 * The Class CallOutNumber.
 * 
 * @author Vinay Vasant More
 * 
 */
public class CallOutNumber {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String input = "99999";
		input = input.replaceFirst("^0*", "");
		callOutNumber(Integer.parseInt(input));
	}

	/**
	 * Call out number.
	 *
	 * @param number the number
	 */
	private static void callOutNumber(int number) {
		int numLen = numLength(number);
		// for number less than 20
		if (number < 20) {
			lessThan20(number);
		}
		// for number greater than 20
		else {
			int num = number;
			int a[] = new int[numLen];
			// storing digits in an array
			for (int i = 0; i <= numLen - 1; i++) {
				a[i] = num % 10;
				num = num / 10;
			}
			// main logic
			for (int i = numLen - 1; i >= 0; i--) {
				if (i == 0) {
					lessThan20(a[i]);
				} else if (i == 1 && a[i] != 0) {
					if (a[i] * 10 + a[i - 1] < 20) {
						lessThan20(a[i] * 10 + a[i - 1]);
						i--;
					} else
						moreThan20(a[i]);
				} else if (i == 2 && a[i] != 0) {
					lessThan20(a[i]);
					System.out.print("Hundred ");
				} else if (i == 3 && a[i] != 0) {
					lessThan20(a[i]);
					System.out.print("Thousand ");
				} else if (i == 4 && a[i] != 0) {
					if (a[i] * 10 + a[i - 1] < 20) {
						lessThan20(a[i] * 10 + a[i - 1]);
						i--;
					} else
						moreThan20(a[i]);
					lessThan20(a[i - 1]);
					i--;
					System.out.print("Thousand ");
				}
			}
		}
	}

	/**
	 * Less than20.
	 *
	 * @param number the number
	 */
	public static void lessThan20(int number) {

		switch (number) {
		case 1:
			System.out.print("One ");
			break;
		case 2:
			System.out.print("Two ");
			break;
		case 3:
			System.out.print("Three ");
			break;
		case 4:
			System.out.print("Four ");
			break;
		case 5:
			System.out.print("Five ");
			break;
		case 6:
			System.out.print("Six ");
			break;
		case 7:
			System.out.print("Seven ");
			break;
		case 8:
			System.out.print("Eight ");
			break;
		case 9:
			System.out.print("Nine ");
			break;
		case 10:
			System.out.print("Ten ");
			break;
		case 11:
			System.out.print("Eleven ");
			break;
		case 12:
			System.out.print("Twelve ");
			break;
		case 13:
			System.out.print("Thirteen ");
			break;
		case 14:
			System.out.print("Fourteen ");
			break;
		case 15:
			System.out.print("Fifteen ");
			break;
		case 16:
			System.out.print("Sixteen ");
			break;
		case 17:
			System.out.print("Seventeen ");
			break;
		case 18:
			System.out.print("Eighteen ");
			break;
		case 19:
			System.out.print("Ninteen ");
			break;
		}
	}

	/**
	 * More than20.
	 *
	 * @param number the number
	 */
	public static void moreThan20(int number) {
		switch (number) {
		case 2:
			System.out.print("Twenty ");
			break;
		case 3:
			System.out.print("Thirty ");
			break;
		case 4:
			System.out.print("Forty ");
			break;
		case 5:
			System.out.print("Fifty ");
			break;
		case 6:
			System.out.print("Sixty ");
			break;
		case 7:
			System.out.print("Seventy ");
			break;
		case 8:
			System.out.print("Eighty ");
			break;
		case 9:
			System.out.print("Ninty ");
			break;
		}
	}

	/**
	 * Num length.
	 *
	 * @param number the number
	 * @return the int
	 */
	public static int numLength(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count = count + 1;
		}
		return count;
	}
}