package com.example.onetoonedemo;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetoonedemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(OnetoonedemoApplication.class, args);
		RoleRepository role;
		role=context.getBean
				(RoleRepository.class);
		
		EmpRepository emp;
		emp=context.getBean
				(EmpRepository.class);
		Role r1=new Role(1,"Admin");
		role.save(r1);
		Role r2=new Role(2,"HR");
		role.save(r2);
		Role r3=new Role(3,"Manager");
		role.save(r3);
		
		Emp e1=new Emp(100,"abc",r1);
		emp.save(e1);
		Emp e2=new Emp(200,"sakshi",r2);
		emp.save(e2);
		
		//update
		Optional<Role>op;
		op=role.findById(2);
		Role r4=op.get();
		System.out.println(r4.getRoll_id());
		System.out.println(r4.getRoll_desc());
		r4.setRoll_desc("HM");
		role.save(r4);
		
		//delete
		Optional<Role>op;
		
				
	}

	
}