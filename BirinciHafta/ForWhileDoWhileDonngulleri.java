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
public class ForWhileDoWhileDonngulleri {
    public static void main(String[] args) {
        // For Döngüsü  -  0 dan 9 'a kadar olan sayilar
    
     for (int i=0;i<10;i++){
         System.out.println(i);
       }
     
        System.out.println("******************************************************************");
      // While Dongusu - 0 dan 9 'a kadar olan sayilar
      int sayi=0;
      while(sayi<10){
          System.out.println(sayi);
          sayi++;
      }
      
        System.out.println("************************************************");
      // Do while Dongusu -  0 dan 9 'a kadar olan sayilar
     
      int sayi2=0;
      do{
          System.out.println(sayi2);
          sayi2++;
          
      }while(sayi2<10);
     
    
    }
    
    
    
    
}
