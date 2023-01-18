package IMSPack.IMSApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import IMSPack.IMSApp.Dao.ProductDao;
import IMSPack.IMSApp.Dao.UsersDao;
import IMSPack.IMSApp.Entity.Products;
import IMSPack.IMSApp.Entity.Users;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
	
	@Autowired
	private UsersDao usersdao;
	
	public ProductServiceImpl() {
		
	}

	@Override
	public List<Products> getProducts() {
		
		return productDao.findAll();
	}

	@Override
	public Products addProducts(Products products) {
		productDao.save(products);
		return products;
		
	}

	@Override
	public Products getProducts(long id) {
		// TODO Auto-generated method stub
		return productDao.getOne(id);
	}

	@Override
	public Products upadteProducts(Products products) {
		productDao.save(products);
		return products;
	}

	@Override
	public void deleteProducts(long parselong) {
		// TODO Auto-generated method stub
		Products entity=productDao.getOne(parselong);
		productDao.delete(entity);
		
	}

	@Override
	public Users getUsers(long id) {
		// TODO Auto-generated method stub
		return usersdao.getOne(id);
	}

	@Override
	public Users addUsers(Users users) {
		// TODO Auto-generated method stub
		usersdao.save(users);
		return users;
	}

	@Override
	public Users updateUsers(Users users) {
		// TODO Auto-generated method stub
		usersdao.save(users);
		return users;
	}

	@Override
	public void deleteUsers(long parselong) {
		// TODO Auto-generated method stub
		Users entity=usersdao.getOne(parselong);
		usersdao.delete(entity);
		
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return usersdao.findAll();
	}

	

}
