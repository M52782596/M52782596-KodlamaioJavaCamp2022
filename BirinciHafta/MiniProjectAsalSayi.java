/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.BirinciHafta;

/**
 *
 * @author merva
 */
public class MiniProjectAsalSayi {
    public static void main(String[] args) {
		int number = -2;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		if (number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime) { 
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}
	}
}
