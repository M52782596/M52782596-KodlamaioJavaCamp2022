/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.Interfaces;

/**
 *
 * @author merva
 */
public class Main {
    
    public static void main(String[] args) {
        
      CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
      customerManager.Add();
    }
}
