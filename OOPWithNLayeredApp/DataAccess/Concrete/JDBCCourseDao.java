/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;
import kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Abstract.CourseDao;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Course;

/**
 *
 * @author merva
 */
public class JDBCCourseDao implements CourseDao{

     private List<Course> courses;
     
     public JDBCCourseDao(){
         this.courses=new ArrayList<>();
     }
    @Override
    public Course getCourseById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Course entity) {
        courses.add(entity);
        System.out.println("Jdbc yontemiyle eklendi");
    }

    @Override
    public List<Course> list() {
     
      return this.courses;
    }

  

   

   
  
    
}
