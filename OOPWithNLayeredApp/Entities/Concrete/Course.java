/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.OOPWithNLayeredApp.Entities.Concrete;
import kodlamaio2022java.OOPWithNLayeredApp.Entities.Abstract.*;


/**
 *
 * @author merva
 */
public class Course  implements Entity{
    private long id;
    private String courseName;
    private String categoryName;
    private double  price;

    public Course() {
    }

    @Override
    public String toString() {
        return "[" +id+" "+courseName+" "+categoryName+" " +price+"]";
    }

   

    public Course(long id, String courseName, String categoryName, double price) {
        this.id = id;
        this.courseName = courseName;
        this.categoryName = categoryName;
        this.price = price;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
}
