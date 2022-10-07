/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.Bussines.Concrete;

import java.util.ArrayList;
import java.util.List;
import kodlamaio2022java.OOPWithNLayeredApp.Bussines.Abstract.CategoryService;
import kodlamaio2022java.OOPWithNLayeredApp.Cors.Abstract.Logger;
import kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Abstract.CategoryDao;

import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Category;
import kodlamaio2022java.OOPWithNLayeredApp.Utils.Concrete.CategoryValidation;

/**
 *
 * @author merva
 */
public class CategoryManager implements CategoryService {
       private CategoryDao dao;
     private List<Logger> loggers;
    public CategoryManager(CategoryDao dao) {
        this.dao = dao;
      loggers=new ArrayList<>();
        
    }

    public CategoryManager(CategoryDao dao, List<Logger> loggers) {
        this.dao = dao;
        this.loggers = loggers;
        
    }
  
    
    @Override
    public void add(Category category){
         
         try {
             if(CategoryValidation.ValidationControl(category, this.list())){
             dao.add(category);
                 
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

    /**
     * @param loggers the loggers to set
     */
    public void setLoggers(Logger logger) {
        
         loggers.add(logger);
    }
    
}
