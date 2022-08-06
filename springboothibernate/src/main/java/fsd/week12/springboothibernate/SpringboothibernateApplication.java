package fsd.week12.springboothibernate;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import fsd.week12.springboothibernate.entity.Passport;
import fsd.week12.springboothibernate.entity.Student;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringboothibernateApplication  implements CommandLineRunner{
	@Autowired
	EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(SpringboothibernateApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		//Passport passport=entityManager.find(Passport.class, 1L);
		//log.info("Passport->{}",passport);
		//log.info("Get Student Details from the Passport->{}",passport.getStudent());
		Student student=entityManager.find(Student.class, 1L);
		log.info("Student->{}",student);
		log.info("Get Passport->{}",student.getPassport());
		
	}

}
