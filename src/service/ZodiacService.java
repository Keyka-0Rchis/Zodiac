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
	
	//初期化のためのコンストラクタ
	public ZodiacService(YearReader scan,ZodiacWriter writer) {
		this.scan = scan;
		this.writer = writer;
	}
	
	
	
	public void execute() {
		var year = this.scan.readLine();
		//if(year == null) {
			//System.out.println("入力値が不正です。");
		//}else {
			this.writer.WriteResult(year,Juboshi.JuboshiCalc(year),Zodiac.ZodiacCalc(year));
		//}
		this.scan.close();
	}
}
