/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.İkinciOdev.ClasslarileCalismak.Inheritance;

/**
 *
 * @author merva
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
		Employe employee = new Employe();
		
		EmployeManager employeeManager = new EmployeManager();
		CustomerManager customerManager = new CustomerManager();
                employeeManager.Add();
                employeeManager.List();
                employeeManager.BestEmploye();
                
                
                
                customerManager.Add();
                customerManager.List();
              
    }
}
