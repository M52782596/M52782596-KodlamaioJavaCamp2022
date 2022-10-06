/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio2022java.İkinciOdev.ClasslarileCalismak.ClassWithEncapsuleAndConsturtorField;

/**
 *
 * @author merva
 */
public class Product {
    private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

    public Product(int _id, String _name, String _description, double _price, int _stockAmount, String _renk) {
        this._id = _id;
        this._name = _name;
        this._description = _description;
        this._price = _price;
        this._stockAmount = _stockAmount;
        this._renk = _renk;
        this._kod =getkod();
    }
    
        
    public Product() {
		System.out.println("yapıcı blok");
	}

	public String getkod() {
		return this.getName().substring(0,1) + getId();
	}

    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _description
     */
    public String getDescription() {
        return _description;
    }

    /**
     * @param _description the _description to set
     */
    public void setDescription(String _description) {
        this._description = _description;
    }

    /**
     * @return the _price
     */
    public double getPrice() {
        return _price;
    }

    /**
     * @param _price the _price to set
     */
    public void setPrice(double _price) {
        this._price = _price;
    }

    /**
     * @return the _stockAmount
     */
    public int getStockAmount() {
        return _stockAmount;
    }

    /**
     * @param _stockAmount the _stockAmount to set
     */
    public void setStockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    /**
     * @return the _renk
     */
    public String getRenk() {
        return _renk;
    }

    /**
     * @param _renk the _renk to set
     */
    public void setRenk(String _renk) {
        this._renk = _renk;
    }

	
}
