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
public class PrimitiveTypesExamples {
    
    public static void main(String[] args) {
        
        byte sayi=127;  // Max 127 min -128;
        sayi =-128;
        
        System.out.println("Byte variable Max value : "+Byte.MAX_VALUE+" Min value : "+Byte.MIN_VALUE);
        
        int sayiInt=Integer.MAX_VALUE;
        sayiInt=Integer.MIN_VALUE;
        
         System.out.println("Integer variable Max value : "+Integer.MAX_VALUE+" Min value : "+Integer.MIN_VALUE);
         
         double sayiDouble=15.2; 
         float sayiFloat=15.2F; // Double a göre daha büyük değerleri kullanmak için kullanılır genellikle
         char a='i'; // karakterleri tutam primitive tiplerdir
         String metin ="Kodlama io Java Camp "; // Metinsel verileri tutan primitive tiptir. // char lardan oluşur.
         boolean dogurmu=true; // true veya false değer alırlar 
        
    }
}
