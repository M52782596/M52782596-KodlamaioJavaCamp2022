/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp;

import java.util.*;
import kodlamaio2022java.OOPWithNLayeredApp.Bussines.Concrete.CategoryManager;
import kodlamaio2022java.OOPWithNLayeredApp.Bussines.Concrete.CourseManager;
import kodlamaio2022java.OOPWithNLayeredApp.Cors.Abstract.Logger;
import kodlamaio2022java.OOPWithNLayeredApp.Cors.Concrete.DbLogger;
import kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Concrete.HibernateCategoryDao;
import kodlamaio2022java.OOPWithNLayeredApp.DataAccess.Concrete.JDBCCourseDao;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete.Category;




/**
 *
 * @author merva
 */
public class Main {
    public static void main(String[] args) {
       
        List<Logger> loggers =new ArrayList<>();
        loggers.add(new DbLogger());
       
        CourseManager coursemanager=new CourseManager(new JDBCCourseDao(), loggers);
//        coursemanager.add(new Course(1, "Java", "Yazılım", 25));
//        coursemanager.add(new Course(2, "C#", "Yazılım", 25));
//        System.out.println(coursemanager.list().toString()); 
//        
        
        CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao());
        categoryManager.add(new Category(1, "Yazılım"));
        categoryManager.setLoggers(new DbLogger());
        
    }
}
