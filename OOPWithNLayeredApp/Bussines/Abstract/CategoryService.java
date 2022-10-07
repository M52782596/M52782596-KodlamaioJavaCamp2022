/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.Bussines.Abstract;

import java.util.List;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Category;

/**
 *
 * @author merva
 */
public interface CategoryService {
       void add(Category category);
    List list();
}

