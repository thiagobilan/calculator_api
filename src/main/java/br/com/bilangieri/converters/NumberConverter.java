package br.com.bilangieri.converters;

public class  NumberConverter {
	public static double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number))
			return Double.parseDouble(number);
		return 1D;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");

	}

	public static boolean isZero(String strNumber) {
		double number = convertToDouble(strNumber);
		if (number == 0)
			return false;
		return true;

	}
	
}
