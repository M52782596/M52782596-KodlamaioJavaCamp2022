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
public class MysqlCustomerDal implements ICustomerDal {
    
     @Override
    public void Add() {

        System.out.println("Mysql Veri Tabanına Eklendi");
    }
}
