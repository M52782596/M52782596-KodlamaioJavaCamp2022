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
public class MiniProjectKalinİnceSesliHarfler {
    public static void main(String[] args) {
		char harf = 'B';
		switch (harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harf");
			break;
		default:
			System.out.println("Geçersiz bir karakter yada sessiz bir  harf girdiniz");
		}
	}

}
