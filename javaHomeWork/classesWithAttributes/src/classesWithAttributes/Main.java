package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(4);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());

	}

}