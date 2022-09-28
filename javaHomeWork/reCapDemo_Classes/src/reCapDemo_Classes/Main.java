package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		int toplam;
		int cikarim;
		int carpim;
		double bolum;
		
		DortIslem dortIslem = new DortIslem();
		
		toplam = dortIslem.Topla(5, 7);
		cikarim = dortIslem.Cikar(10, 3);
		carpim = dortIslem.Carp(3, 7);
		bolum = dortIslem.Bol(10, 3);
		
		System.out.println(toplam);
		System.out.println(cikarim);
		System.out.println(carpim);
		System.out.println(bolum);
	}

}
