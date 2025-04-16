package repository;

import java.util.Scanner;

public class YearReader {
	
	private final Scanner scan;
	
	public YearReader(Scanner scan) {
		this.scan = scan;
	}
	//これはつまりScanner型をYearReader型に変換してんだな。うん。きっとそうだそうに違いないそうじゃなかったらもう無理
	
	public Integer year;
	//yearを取得しに行くメソッド
	public Integer readLine() {
		System.out.println("西暦の年号を入力してください");
		String stryear = this.scan.nextLine();
		try {
			year = Integer.parseInt(stryear);
			return year;
		}catch(NumberFormatException ex) {
			//System.out.println("入力値が不正です。");
			//これはいまではない。多分。
			year = null;
			return year;
		}
	}
	
	public void close() {
		this.scan.close();
	}
}
