package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.5;
		double dolarBugun = 18.4;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun) {
			okYonu = "Down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "Up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "Equal.svg";
			System.out.println(okYonu);
		}
		
		
		String[] krediler = {"Hızlı Kredi", "İhtiyaç Kredisi", "Maaşını Halkbanktan Alan", "Mutlu Emekli"};
		
		for (var kredi : krediler) {
			System.out.println(kredi);
		}
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
