package IMSPack.IMSApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import IMSPack.IMSApp.Entity.Users;

public interface UsersDao extends JpaRepository<Users, Long>{

}
