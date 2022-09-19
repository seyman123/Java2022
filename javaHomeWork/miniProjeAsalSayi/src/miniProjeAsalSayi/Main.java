package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int sayi = 8;
		int sayac = 0;
		
		if (sayi == 1 || sayi == 0) {
			System.out.println("Bu sayıların asallığı söz konusu değildir");
		}else {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					sayac++;
				}
			}
			
			if (sayac == 0) {
				System.out.println(sayi + " sayısı asaldır");
			}else {
				System.out.println(sayi + " sayısı asal değildir");
			}
		}
		

	}

}
