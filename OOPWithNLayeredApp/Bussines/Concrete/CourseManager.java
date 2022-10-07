/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.Bussines.Concrete;

import java.util.List;
import java.util.logging.Level;
import kodlamaio2022java.OOPWithNLayeredApp.Bussines.Abstract.CourseService;
import kodlamaio2022java.OOPWithNLayeredApp.Cors.Abstract.Logger;
import kodlamaio2022java.OOPWithNLayeredApp.Utils.Concrete.CourseValidation;
import kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Abstract.CourseDao;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Course;

/**
 *
 * @author merva
 */
public class CourseManager implements CourseService{

     private CourseDao dao;
     private List<Logger> loggers;
    public CourseManager(CourseDao dao) {
        this.dao = dao;
      
        
    }

    public CourseManager(CourseDao dao, List<Logger> loggers) {
        this.dao = dao;
        this.loggers = loggers;
        
    }
  
    
    @Override
    public void add(Course course){
         
         try {
             if(CourseValidation.ValidationControl(course, this.list())){
                 dao.add(course);
                 
                 for(Logger logger:loggers){
                     logger.Log("Başarıyla Eklendi");
                 }
             }
         } catch (Exception ex) {
             System.err.println(ex.getMessage());
         }
           
        
          
    }

    @Override
    public List list() {
      return  this.dao.list();
    }
     public void setLoggers(Logger logger) {
         loggers.add(logger);
    }
    
}
