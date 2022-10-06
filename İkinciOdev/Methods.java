/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.İkinciOdev;

/**
 *
 * @author merva
 */
public class Methods {
    public static void main(String[] args) {
		sayiBulmaca();

	}
	// Parametresiz Metod Kullanımı
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true ; 
				break;
			}
			
		}
		if(varMi) {
			mesajVer("Sayı bulundu: " + aranacak);
		}else {
			mesajVer("Sayı bulunamadı: " + aranacak);
		}
	}
	
        // Parametreli Metod Kullanımı
	public static void mesajVer(String mesaj)
	{
		System.out.println(mesaj);
	}
}
