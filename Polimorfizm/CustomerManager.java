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
public class CustomerManager {
    
    private BaseLogger  logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }
    public void Add(){
        System.out.println("Müşteri Ekleme işlemi tetiklendi");
        this.logger.Log("Müşteri Eklendi");
    }
}
