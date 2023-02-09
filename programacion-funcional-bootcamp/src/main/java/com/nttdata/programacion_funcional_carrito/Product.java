package com.nttdata.programacion_funcional_carrito;

import java.math.BigDecimal;

public class Product {
	
    public String name;
    public BigDecimal price;
    public Tax tax;
    
    Product(String name, BigDecimal price, Tax tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the tax
	 */
	public Tax getTax() {
		return tax;
	}

	/**
	 * @param tax the tax to set
	 */
	public void setTax(Tax tax) {
		this.tax = tax;
	}

}
