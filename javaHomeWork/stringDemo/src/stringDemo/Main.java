package stringDemo;

public class Main {

	public static void main(String[] args) {

		String message = "Bugün hava çok güzel";
		
		System.out.println("Eleman sayısı : " + message.length());
		System.out.println("5. eleman : " + message.charAt(4));
		System.out.println(message.concat(". Yaşasın!"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("l"));
		
		char[] chars = new char[5];
		message.getChars(0, 5, chars, 0);
		System.out.println(chars);
		
		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("güzel"));
		
		System.out.println("--------------");
		
		String newMessage = message.replace(" ", "-");
		System.out.println(newMessage);
		
		System.out.println(message.substring(2,7));
		
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		//Başındaki ve sonundaki boşlukları siler.
		System.out.println(message.trim());
 	}

}
