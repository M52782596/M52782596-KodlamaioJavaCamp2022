/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.Utils.Concrete;

import java.util.List;
import kodlamaio2022java.OOPWithNLayeredApp.Utils.Abstract.ValidationService;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Course;

/**
 *
 * @author merva
 */
public class CourseValidation implements ValidationService<Course> {
    
   

  

   public static boolean ValidationControl(Course course,List<Course> courses) throws Exception{
       
      if(course!=null){
           if(course.getPrice()<0){
               throw new Exception(" Price sıfırdan küçük olamaz");
           }
          
           for(Course c :courses){
          
           if(c.getCourseName().toLowerCase().trim().equals(course.getCourseName().toLowerCase().trim())){
              
               throw new Exception(course.getCourseName()+" adında zaten bir course  var");
           }
          
            }
    
      }
      else{
          throw new NullPointerException("Null Değer Döndürdü");
      }
      return true;

}
}