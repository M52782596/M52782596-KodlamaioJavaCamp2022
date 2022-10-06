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
public class Switchs {
    public static void main(String[] args) {
        char harfNotu='A';
        switch(harfNotu){
            case 'A': System.out.println("Mükemmel bir not ile geçtiniz");
            break;
            case 'B':System.out.println("Mükemmele yakın bir not ile geçtiniz");
            break;
             case 'C':System.out.println("Ortalama bir not ile geçtiniz");
            break;
             case 'D':System.out.println("Sınırda Geçtiniz");
            break;
             default: System.out.println("Harf Geçersiz yada Sınıfta kaldınız");
            
        }
    }
            
}
