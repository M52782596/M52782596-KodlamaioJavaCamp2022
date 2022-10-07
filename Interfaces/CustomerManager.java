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
public class CustomerManager {
    private ICustomerDal customerDal;

    // Dependecy Injection
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    
    public void Add(){
        this.customerDal.Add();
    }
    
    
}
