package domain;

public class Juboshi {
	
	
	String Juboshi;
	public String JuboshiCalc(Integer year) {
		switch(year%10) {
			case 0:
				Juboshi = "庚";
				break;
			case 1:
				Juboshi = "辛";
				break;
			case 2:
				Juboshi = "壬";
				break;
			case 3:
				Juboshi = "癸";
				break;
			case 4:
				Juboshi = "甲";
				break;
			case 5:
				Juboshi = "乙";
				break;
			case 6:
				Juboshi = "丙";
				break;
			case 7:
				Juboshi = "丁";
				break;
			case 8:
				Juboshi = "戊";
				break;
			case 9:
				Juboshi = "己";
				break;
		}
		return Juboshi;
	}
	
}
