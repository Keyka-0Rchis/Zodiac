package service;

import domain.Juboshi;
import domain.Zodiac;
import repository.YearReader;
import repository.ZodiacWriter;

public class ZodiacService {
	//ここでは西暦を受け取ったのち、
	//domainのメソッドにしたがって十干十二支を作成し、
	//それを出力することを目標とする。
	
	
	//ここで使う中身のない変数（クラス対応のものを用意するためだけの変数）
	public final YearReader scan;
	public final ZodiacWriter writer;
	public final Juboshi juboshi;
	public final Zodiac zodiac;
	
	//初期化のためのコンストラクタ
	public ZodiacService(YearReader scan,ZodiacWriter writer,Juboshi juboshi,Zodiac zodiac) {
		this.scan = scan;
		this.writer = writer;
		this.juboshi = juboshi;
		this.zodiac = zodiac;
	}
	
	
	
	public void execute() {
		var year = this.scan.readLine();
		if(year == null) {
			System.out.println("入力値が不正です。");
		}else {
			this.writer.WriteResult(year,this.juboshi.JuboshiCalc(year),this.zodiac.ZodiacCalc(year));
		}
		this.scan.close();
	}
}
