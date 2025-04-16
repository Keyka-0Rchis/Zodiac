package domain;

public class Zodiac {
	
	String Zodiac;
	public String ZodiacCalc(Integer year) {
		switch(year%12) {
			case 0:
				Zodiac = "申";
				break;
			case 1:
				Zodiac = "酉";
				break;
			case 2:
				Zodiac = "戌";
				break;
			case 3:
				Zodiac = "亥";
				break;
			case 4:
				Zodiac = "子";
				break;
			case 5:
				Zodiac = "丑";
				break;
			case 6:
				Zodiac = "寅";
				break;
			case 7:
				Zodiac = "卯";
				break;
			case 8:
				Zodiac = "辰";
				break;
			case 9:
				Zodiac = "巳";
				break;
			case 10:
				Zodiac = "午";
				break;
			case 11:
				Zodiac = "未";
				break;
		}
		return Zodiac;
	}
}
