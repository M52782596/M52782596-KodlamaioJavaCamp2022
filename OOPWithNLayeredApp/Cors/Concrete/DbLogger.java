/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.Cors.Concrete;

import kodlamaio2022java.OOPWithNLayeredApp.Cors.Abstract.Logger;

/**
 *
 * @author merva
 */
public class DbLogger implements Logger {

    public DbLogger() {
    }
    
      @Override
    public void Log(String message) {
        System.out.println("Db logger : "+message);
    }
}
