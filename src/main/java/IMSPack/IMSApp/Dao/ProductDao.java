package IMSPack.IMSApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import IMSPack.IMSApp.Entity.Products;

public interface ProductDao extends JpaRepository<Products, Long>{

}
