/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.İkinciOdev.ClasslarileCalismak.ClassWithEncapsuleAndConsturtorField;

/**
 *
 * @author merva
 */
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

	

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getkod());
                
                Product  newProduct=new Product(2, "Laptop", "Lenovo i5", 5000, 5, "Gri");
                 productManager.Add(newProduct);
                
    }
}
