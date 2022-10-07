/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Abstract;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Category;

/**
 *
 * @author merva
 */
public interface CategoryDao extends IDao<Category> {
     Category getCategoryById(long id);
}
