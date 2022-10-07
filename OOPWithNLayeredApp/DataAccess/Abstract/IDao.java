/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Abstract;

import java.util.List;

/**
 *
 * @author merva
 */
public interface IDao<T> {
    void add(T entity);
    List<T> list();
}
