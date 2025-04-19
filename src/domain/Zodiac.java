package domain;

public class Zodiac {
	
	public static String ZodiacCalc(int year) {
		return switch(year%12) {
			case 0 -> "申";
			case 1 -> "酉";
			case 2 -> "戌";
			case 3 -> "亥";
			case 4 -> "子";
			case 5 -> "丑";
			case 6 -> "寅";
			case 7 -> "卯";
			case 8 -> "辰";
			case 9 -> "巳";
			case 10 -> "午";
			case 11 -> "未";
			default -> "???";
		};
	}
}
