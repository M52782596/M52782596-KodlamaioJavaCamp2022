/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.İkinciOdev.ClasslarileCalismak;

import kodlamaio2022java.İkinciOdev.ClasslarileCalismak.ClassWithEncapsuleAndConsturtorField.ProductManager;
import kodlamaio2022java.İkinciOdev.ClasslarileCalismak.ClassWithEncapsuleAndConsturtorField.Product;

/**
 *
 * @author merva
 */
public class Main {
    public static void main(String[] args) {
        
        CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
	
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
        
		
	}

}
