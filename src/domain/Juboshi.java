package domain;

public class Juboshi {
	
	public static String JuboshiCalc(int year) {
		return switch(year%10) {
			case 0 -> "庚";
			case 1 -> "辛";
			case 2 -> "壬";
			case 3 -> "癸";
			case 4 -> "甲";
			case 5 -> "乙";
			case 6 -> "丙";
			case 7 -> "丁";
			case 8 -> "戊";
			case 9 -> "己";
			default -> "???";
		};
	}
}
