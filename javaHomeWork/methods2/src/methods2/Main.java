package methods2;

public class Main {

	public static void main(String[] args) {
		
		ekle();
		
		int toplam = topla(5, 7);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	

}
