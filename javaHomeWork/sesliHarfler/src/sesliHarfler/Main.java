package sesliHarfler;

public class Main {
	public static void main(String[] args) {
		
		char aranan = 'U';
		
		char[] kalınSesliler = {'A', 'I', 'O', 'U'};
		char[] inceSesliler = {'E', 'İ', 'Ö', 'Ü'};
				
		for (char harf : kalınSesliler) {
			if (aranan == harf) {
				System.out.println(aranan + " harfi kalın sesli bir harftir");
				break;
			} 
		}	
		for (char harf : inceSesliler) {
			if (aranan == harf) {
				System.out.println(aranan + " harfi ince sesli bir harftir");
			}
		} 		
	}
}


