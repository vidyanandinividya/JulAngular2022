package fsd.week11.mysqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fsd.week11.mysqldemo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
