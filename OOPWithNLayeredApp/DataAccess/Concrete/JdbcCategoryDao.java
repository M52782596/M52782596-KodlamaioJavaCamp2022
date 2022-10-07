/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;
import kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Abstract.CategoryDao;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Category;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Course;

/**
 *
 * @author merva
 */
public class JdbcCategoryDao implements CategoryDao {
      private List<Category> courses;
     
     public JdbcCategoryDao(){
         this.courses=new ArrayList<>();
     }
    @Override
    public Category getCategoryById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Category entity) {
        courses.add(entity);
        System.out.println("Jdbc yontemiyle eklendi");
    }

    @Override
    public List<Category> list() {
     
      return this.courses;
    }
}
