/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.Utils.Concrete;

import java.util.List;
import kodlamaio2022java.OOPWithNLayeredApp.Cors.Abstract.ValidationService;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Category;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Course;

/**
 *
 * @author merva
 */
public class CategoryValidation implements ValidationService {
    
     public static boolean ValidationControl(Category category,List<Category> categories) throws Exception{
       
      if(category!=null){
           
          
           for(Category c :categories){
          
           if(c.getCategoryName().toLowerCase().trim().equals(category.getCategoryName().toLowerCase().trim())){
              
               throw new Exception(category.getCategoryName()+" adında zaten bir category  var");
           }
          
            }
    
      }
      else{
          throw new NullPointerException("Null Değer Döndürdü");
      }
      return true;

}
}
