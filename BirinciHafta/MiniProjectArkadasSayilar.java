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
public class MiniProjectArkadasSayilar {
    public static void main(String[] args) {
		int number1 = 220;
		int number2 =284;
		int total1 = 0;
		int total2 =0;

		
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
					total1 = total1 + i;
			}
				}
		for (int i = 1; i < number2; i++) {
		if (number2 % i == 0) {
			total2 = total2 + i;
			}
			}
	
			
			
		if (total1==number2 && total2==number1) {
			System.out.println("Arkadaş sayılar");
		}
		else {
			System.out.println("Arkadaş sayı değiller");
		}
	}
}
