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
public class MiniProjectMukemmelSayi {
    public static void main(String[] args) {
		int number = 1;
		int total = 0;

		if (number<=1) {
			System.out.println("Geçersiz sayı girdiniz");
			return;
		}
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
					total = total + i;
				}

			}
		if (total==number) {
			System.out.println("Bu sayı mühemmel sayıdır");
		}
		else {
			System.out.println("Bu sayı mükemmel sayı değidir");
		}
	}

}
