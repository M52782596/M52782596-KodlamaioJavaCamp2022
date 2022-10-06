/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.İkinciOdev.ClasslarileCalismak;

/**
 *
 * @author merva
 */


public class MethodOverloading {
    
    
    public static void main(String[] args) {
        Dortİslem islem=new Dortİslem();
        System.out.println(islem.topla(5,6));
        System.out.println(islem.topla(5,6,7));
    }
    
    
}

class Dortİslem{
    public int  topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public int  topla(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }
}