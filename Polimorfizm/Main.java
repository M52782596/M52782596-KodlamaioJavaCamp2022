/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.Polimorfizm;

/**
 *
 * @author merva
 */
public class Main {
    public static void main(String[] args) {
         BaseLogger [] loggers= {new FileLogger(),new DbLogger(),new EmailLogger()};
    
     for(BaseLogger logger : loggers){
         logger.Log(" Log Mesajı");
       }
    
     
        System.out.println("******************************************");
        
    CustomerManager customerManager=new CustomerManager(new EmailLogger());
    
           customerManager.Add();
    
    }
    
   
}
