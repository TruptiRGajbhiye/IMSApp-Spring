package IMSPack.IMSApp.Services;

import java.util.List;


import IMSPack.IMSApp.Entity.Products;
import IMSPack.IMSApp.Entity.Users;


public interface ProductService {
	public List<Products> getProducts();
	
	public Products getProducts(long id);
	
	public Products addProducts(Products products);
	
	public Products upadteProducts(Products products);
	
	public void deleteProducts(long parselong);
	
	public List<Users> getUsers();
	public Users getUsers(long id);
	public Users addUsers(Users users);
	public Users updateUsers(Users users);
	public void deleteUsers(long parselong);
	

}
