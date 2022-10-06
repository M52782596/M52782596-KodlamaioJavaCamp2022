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
public class MiniProjectSayiBulma {
    public static void main(String[] args) {
		int [] numbers= new int [] {1,2,5,7,9,0};
		int found =0;
		boolean varMı=false;
		
		
		  for (int number:numbers) {
			  if(number==found) {
				  varMı=true;
			  break;
			  }
		  }
		  if (varMı) {
			  System.out.println("Var");
			  } 
		  else {
			  System.out.println("Yok");
		  }
		 
		
	}

}
