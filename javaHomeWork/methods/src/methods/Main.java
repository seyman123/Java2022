package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] numbers = new int[] {1, 2, 3, 6, 5, 8, 0};
		int toBeFound = 3;
		boolean isThere = false;
		
		for (int number : numbers) {
			if (toBeFound == number) {
				isThere = true;
			} 
		}
		
		if (isThere) {
			mesajVer("Evet, aradığınız sayı listede var");
		}else {
			mesajVer("Hayır, aradığınız sayı listede yok");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
