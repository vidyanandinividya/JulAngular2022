package capgem.demo.registrationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import capgem.demo.registrationserver.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
