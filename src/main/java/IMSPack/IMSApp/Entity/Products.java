package IMSPack.IMSApp.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	
	@Id
	private long id;
	private String name, specification,added_date;
	private int quantity;
	private double original_price, retail_price;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getAdded_date() {
		return added_date;
	}
	public void setAdded_date(String added_date) {
		this.added_date = added_date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getOriginal_price() {
		return original_price;
	}
	public void setOriginal_price(double original_price) {
		this.original_price = original_price;
	}
	public double getRetail_price() {
		return retail_price;
	}
	public void setRetail_price(double retail_price) {
		this.retail_price = retail_price;
	}
	public Products(long id, String name, String specification, String added_date, int quantity, double original_price,
			double retail_price) {
		super();
		this.id = id;
		this.name = name;
		this.specification = specification;
		this.added_date = added_date;
		this.quantity = quantity;
		this.original_price = original_price;
		this.retail_price = retail_price;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", specification=" + specification + ", added_date="
				+ added_date + ", quantity=" + quantity + ", original_price=" + original_price + ", retail_price="
				+ retail_price + "]";
	}
	
	
	

}
