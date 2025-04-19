package repository;

import java.util.Scanner;

public class YearReader {
	
	private final Scanner scan;
	
	public YearReader(Scanner scan) {
		this.scan = scan;
	}
	//これはつまりScanner型をYearReader型に変換してんだな。うん。きっとそうだそうに違いないそうじゃなかったらもう無理
	

	//yearを取得しに行くメソッド
	public int readLine() {
		System.out.println("西暦の年号を入力してください");
		try {
			return Integer.parseInt(this.scan.nextLine());
		}catch(NumberFormatException ex) {
			System.out.println("入力値が不正です。");
			//これはいまではない。多分。
			//year = null;
			//return year;
			throw ex;
			//throw：エラー限定でリターンないよ！エラーだよ！って言ってくれる。
		}
	}
	
	public void close() {
		this.scan.close();
	}
}
