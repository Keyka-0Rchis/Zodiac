import java.util.Scanner;

import repository.YearReader;
import repository.ZodiacWriter;
import service.ZodiacService;


public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new ZodiacService(new YearReader(new Scanner(System.in)),new ZodiacWriter()).execute();
	}
}
