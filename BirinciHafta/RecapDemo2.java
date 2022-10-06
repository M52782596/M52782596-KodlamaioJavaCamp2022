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
public class RecapDemo2 {
    public static void main(String[] args) {
		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam= " + total);
		System.out.println("En Büyük= " + max);
	}
}
