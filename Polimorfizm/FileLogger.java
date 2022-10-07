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
public class FileLogger extends BaseLogger{
     @Override
    public void Log(String message) {
        System.out.println("File loglandı" +message);
                
    }
    
}
