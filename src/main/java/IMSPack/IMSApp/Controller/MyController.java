package IMSPack.IMSApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import IMSPack.IMSApp.Entity.Products;
import IMSPack.IMSApp.Entity.Users;
import IMSPack.IMSApp.Services.ProductService;


@RestController
public class MyController {
	
	@Autowired
	public ProductService productService;
	
	@GetMapping("/home")
	public String Home() {
		return "Welcome to course App ";
	}
	
	@GetMapping("/products")
	public List<Products> getProducts(){
		return this.productService.getProducts();
	}
	
	@PostMapping("/products")
	public Products addProducts(@RequestBody Products products ) {
		return this.productService.addProducts(products);
		
	}
	
	@GetMapping("/products/{id}")
	public Products getProducts(@PathVariable String id) {
		
		return this.productService.getProducts(Long.parseLong(id));
	}
	
	@PutMapping("/products")
	public Products updateProducts(@RequestBody Products products) {
		return this.productService.upadteProducts(products);
		
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<HttpStatus> deleteProducts(@PathVariable String id){
		
		try {
			this.productService.deleteProducts(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping("/users")
	public List<Users> getUsers(){
		return this.productService.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public Users getUsers(@PathVariable String id) {
		
		return this.productService.getUsers(Long.parseLong(id));
	}

	@PostMapping("/users")
	public Users addUsers(@RequestBody Users users ) {
		return this.productService.addUsers(users);
		
	}
	
	@PutMapping("/users")
	public Users updateUsers(@RequestBody Users users) {
		return this.productService.updateUsers(users);
		
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUsers(@PathVariable String id){
		
		try {
			this.productService.deleteUsers(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
