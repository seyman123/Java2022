package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1, 2, 3, 6, 5, 8, 0};
		int toBeFound = 4;
		boolean isThere = false;
		
		for (int number : numbers) {
			if (toBeFound == number) {
				isThere = true;
			} 
		}
		
		if (isThere) {
			System.out.println("Evet, aradğınız sayı listede var");
		}else {
			System.out.println("Hayır, aradığınız sayı listede yok");
		}

	}

}
